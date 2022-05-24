package demoMethodReference.demo_buildin_functional_interface;

import java.util.List;
import java.util.function.Consumer;

public class DemoConsumer {
    public static void main(String[] args) {
        List<String> names = List.of("An", "Vinh", "Hoa");

        //cach1
        names.forEach(name -> System.out.println(name));

        //cach2
        names.forEach(System.out::println);

        //cach3
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        names.forEach(consumer);
    }
}
