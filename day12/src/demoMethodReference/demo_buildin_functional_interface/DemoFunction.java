package demoMethodReference.demo_buildin_functional_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class DemoFunction {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("An");
        names.add("Vinh");
        names.add("Hoa");

        Function<String, String> function = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase(Locale.ROOT);
            }
        };

        names.stream().map(function).forEach(System.out::println);
        //c2: su dung lambda
        names.stream().map(name -> name.toUpperCase(Locale.ROOT)).forEach(System.out::println);
        //c3
        names.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
