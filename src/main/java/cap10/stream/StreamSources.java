package cap10.stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamSources {
    //Criar explicações aqui
    Stream<String> empty = Stream.empty(); // count = 0;
    Stream<Integer> singleElement = Stream.of(1); // count = 1;
    Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3;

    Stream<Double> randoms = Stream.generate(Math::random); // infinite stream
    Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2); // infinite stream

    Stream<Integer> oddNumbersUnder100 = Stream.iterate(
            1,
            n -> n < 100,
            n -> n + 2
    ); // infinite stream

    public void test(){
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();

        var list1 = List.of("a", "b", "c");
        Stream<String> fromListParallel = list.parallelStream();
    }

}
