package demo_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoStream {
    public static void main(String[] args) {
        //mot so cach tao ra stream
        //c1: su dung Stream.of()
        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);

        Stream<String> names = Stream.<String>builder()
                .add("1")
                .add("2")
                .add("3")
                .build();

        //c3: su dung range
        IntStream intStream = IntStream.range(1, 10);

        //c4; su dung Array.Stream
        int[] numbers1 = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(numbers1);

        //c5: Tao Stream tu collection
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Stream<Integer> listStream = list.stream();

    }
}
