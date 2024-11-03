package cap15.jdbc;

public class PreparedStatementExample {
    String sqlAdicionaPessoa = "INSERT INTO pessoas VALUES (?, ?)";
    String sqlAtualizaPessoa = "UPDATE pessoas SET nome = ? WHERE id = ?";
    String sqlRemovePessoa = "DELETE FROM pessoas WHERE id = ?";
    String sqlListaPessoas = "SELECT * FROM pessoas";

    public void executaConsultas() {

    }


    public static void main(String[] args){

    }
}
