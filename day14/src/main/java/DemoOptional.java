import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.Optional;

public class DemoOptional {
    public static void main(String[] args) {
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);


        //2. Tao optional co gia tri khac null
        Optional<String> stringOptional = Optional.of("hello");
        System.out.println(stringOptional);

        Optional<Integer> integerOptional = Optional.ofNullable(1);
        Optional<Integer> integerOptional1 = Optional.ofNullable(null);
        System.out.println(integerOptional);
        System.out.println(integerOptional1);
    }
}
