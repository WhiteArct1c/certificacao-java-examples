package cap10.stream;

import java.util.List;

public class IntermediateOperations {
    public static void main(String[] args) {
        //Criar exemplos aqui
        var list = List.of("Ernane", "Ademar", "Nathan", "Aline", "Luque");
        list.stream()
                .filter(n -> n.length() == 5)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}
