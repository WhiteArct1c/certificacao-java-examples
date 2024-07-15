package cap10.primitiveStreams;

import javax.swing.text.html.Option;
import java.sql.Array;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

    public static void main(String[] args) {
        //Criar exemplos aqui
//        Stream<Integer> stream = Stream.of(1,2,3);
////        System.out.println(stream.reduce(0, Integer::sum));
//        System.out.println(stream.mapToInt(x -> x).sum());

//        IntStream intStream = IntStream.of(1,2,3,4);
//        System.out.println(max(intStream));
//        Stream<Integer> response = boxingToIntStream(intStream);
//        response.forEach(System.out::println);
//        OptionalDouble media = intStream.average();
//        System.out.println(media.getAsDouble());

//        var stream = IntStream.rangeClosed(1,10);
//        OptionalDouble average = stream.average();
//        average.ifPresent(System.out::println);

//        Supplier<Stream<Integer>> sup = () -> Stream.of(1,2,3,4);
//        System.out.println(sup.get().max(Integer::compareTo));
//        System.out.println(sup.get().max(Integer::compareTo));

//        }

//        var cats = new ArrayList<String>();
//        cats.add("Annie");
//        cats.add("Ripley");
//        var stream = cats.stream();
//        cats.add("KC");
//        System.out.println(stream.count());

//        Optional<String> optional = Optional.of("teste");
//        Optional<Integer> resultado = optional.map(String::length);

        Optional<Integer> optional = Optional.of(4);

    }

    private static Stream<Integer> boxingToIntStream(IntStream intStream){
        return intStream.boxed();
    }

    private static int max(IntStream intStream){
        OptionalInt op = intStream.peek(System.out::println).max().stream().peek(System.out::println).min();
        return op.orElseThrow(RuntimeException::new);
    }

    private static int range(IntStream intStream){
        IntSummaryStatistics stats = intStream.summaryStatistics();
        if(stats.getCount() == 0){
            throw new RuntimeException();
        }
        return stats.getMax() - stats.getMin();
    }

    private static void tresDigitos(Optional<Integer> op){
        if(op.isPresent()){
            int value = op.get();
            String str = ""+ value;
            if(str.length() == 3){
                System.out.println(value);
            }
        }
    }

    private static void tresDigitosSegundo(Optional<Integer> op){
        op.map(n -> "" + n)
                .filter(s -> s.length() == 3)
                .ifPresent(System.out::println);
    }


}
