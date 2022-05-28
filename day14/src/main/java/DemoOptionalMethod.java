import java.util.Optional;

public class DemoOptionalMethod {
    public static void main(String[] args) {
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);


        //2. Tao optional co gia tri khac null
        Optional<String> stringOptional = Optional.of("hello");
        System.out.println(stringOptional);

        //********1 so methods******
        // get() : lay ra gia tri trong optional
        //isPresent() vaf ifPresent(): Kiem tra optional co gia tri hay ko
        if(optionalEmpty.isPresent()){
            System.out.println("value:" + optionalEmpty.get());
        }
        else {
            System.out.println("Khong co gia tri");
        }

        if(stringOptional.isEmpty()){
            System.out.println("Khong co gia tri");
        }
        else {
            System.out.println("value:" + stringOptional.get());
        }

        stringOptional.ifPresent(s -> System.out.println("value: " + s));
        //orElse: tra ve gia tri cua Optional neu khac rong
        //Ngc lai: tra ve gia tri mac dinh duoc truyen vao
        String value = stringOptional.orElse("Default value");
        System.out.println(value);

        //orElseThrow()
        //neu Optional co gia tri => tra ve gia tri do
        //Ngc lai => throw exception
        String value2 = stringOptional.orElseThrow(() -> {
            throw new RuntimeException("Error");
        });
        System.out.println(value2);

        try{
        String value3 = optionalEmpty.orElseThrow(() -> {
            throw new RuntimeException("Error");
        });
        System.out.println(value2);}
        catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
