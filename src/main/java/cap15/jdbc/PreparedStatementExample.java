package cap15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
    String sqlAdicionaPessoa = "INSERT INTO pessoas VALUES (?, ?)";
    String sqlAtualizaPessoa = "UPDATE pessoas SET nome = ? WHERE id = ?";
    String sqlRemovePessoa = "DELETE FROM pessoas WHERE id = ?";
    String sqlListaPessoas = "SELECT * FROM pessoas";

    public void executaConsultas() throws SQLException {
        try(Connection conn = DriverManager.getConnection(
                System.getenv("POSTGRES_USER"),
                System.getenv("POSTGRES_PASSWORD"),
                System.getenv("POSTGRES_DB")
        )){
            conn.createStatement().execute("CREATE TABLE IF NOT EXISTS pessoas (id serial PRIMARY KEY, nome VARCHAR(255))");

            try(var ps = conn.prepareStatement(sqlAdicionaPessoa)){
                ps.setInt(1, 1);
                ps.setString(2, "Aline");
                var result = ps.executeUpdate();
                System.out.println("Pessoa adicionada com sucesso: " + result);
            }

            try(var ps = conn.prepareStatement(sqlAtualizaPessoa)){
                ps.setString(1, "Nathasha");
                ps.setInt(2, 1);
                var result = ps.executeUpdate();
                System.out.println("Pessoa atualizada com sucesso: " + result);
            }

            try(var ps = conn.prepareStatement(sqlListaPessoas)){
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    System.out.println("ID: " + rs.getInt("id") + "\nNome: " + rs.getString("nome"));
                }
            }

            try(var ps = conn.prepareStatement(sqlRemovePessoa)){
                ps.setInt(1, 1);
                var result = ps.executeUpdate();
                System.out.println("Pessoa removida com sucesso: " + result);
            }

        }
    }


    public static void main(String[] args){
        try{
            new PreparedStatementExample().executaConsultas();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
