package demo_stream;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class DemoStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 3, 12, 6, 7, 5, 3);

        //Duyệt numbers
        numbers.stream().forEach(System.out::println);
        System.out.println();
        //Tìm các giá trị chẵn trong list
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println();
        //Tìm các giá trị > 5 trong list
        numbers.stream().filter(n -> n > 5).forEach(System.out::println);
        System.out.println();
        //Tìm giá trị max trong list
        Optional<Integer> maxOptional = numbers.stream().max((o1, o2) -> o1 - o2);
        maxOptional.ifPresent(System.out::println);

        numbers.stream().sorted(Comparator.comparingInt(a -> (int) a).reversed())
                .limit(1)
                .forEach(System.out::println);
        System.out.println();
        //Tìm giá trị min trong list

        //Tính tổng các phần tử của mảng
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum + "\n");

        //Lấy danh sách các phần tử không trùng nhau
        numbers.stream().distinct().forEach(System.out::println);
        System.out.println();
        //Lấy 5 phần tử đầu tiên trong mảng
        numbers.stream().limit(5).forEach(System.out::println);
        System.out.println();

        //Lấy phần tử từ thứ 3 -> thứ 5
        numbers.stream().skip(2).limit(3).forEach(System.out::println);
        System.out.println();

        //Lấy phần tử đầu tiên > 5
//        Optional<Integer> firstNumberHigherThan5 = numbers.stream().filter(n -> n > 5).findFirst();
//        firstNumberHigherThan5.ifPresent(System.out::println);
        numbers.stream().filter(n -> n > 5).limit(1).forEach(System.out::println);
        System.out.println();

        //Kiểm tra xem list có phải là list chẵn hay không
        boolean isListOdd = numbers.stream().allMatch(n -> n % 2 == 0);
        System.out.println(isListOdd + "\n");

        //Kiểm tra xem list có phần tử > 10 hay không
        boolean isHigherThan10 = numbers.stream().anyMatch(n -> n > 10);
        System.out.println(isHigherThan10 + "\n");

        //Có bao nhiêu phần tử > 5
        long countGreaterThan5 = numbers.stream().filter(n -> n > 5).count();
        System.out.println(countGreaterThan5 + "\n");


        //Nhân đôi các phần tủ trong list và trả về list mới
        List<Integer> numbersDouble = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        numbersDouble.stream().forEach(System.out::println);
        System.out.println();

        //Kiểm tra xem list không chứa giá trị nào = 8 hay không
        boolean notContain8 = numbers.stream().noneMatch(n -> n == 8);
        System.out.println(notContain8 + "\n");
    }
}