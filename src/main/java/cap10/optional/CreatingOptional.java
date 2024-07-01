package cap10.optional;

import java.util.Optional;

public class CreatingOptional {

    /**
     * Método estático que calcula uma média simples
     * @param scores - valores das notas
     * @return - retorna um Optional vazio se os valores do parametro forem nulos ou retorna o valor (DOUBLE) da média simples das notas em um Optional
     */
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average()); // Optional.empty

        Optional<Double> opt = average(90, 100);
        if (opt.isPresent()) {
            System.out.println(opt.get()); // 95.0
        }

        Optional<Double> opt2 = average();
        System.out.println(opt2.get());

        String value = null;
//        Optional o = (value == null) ? Optional.empty() : Optional.of(value);
        Optional o = Optional.of(null);
        System.out.println(o);
    }
}
