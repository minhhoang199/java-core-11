
@FunctionalInterface
interface Hello{
    void sayHello();
}

@FunctionalInterface
interface Greeting1 {
    void sayHello(String name);
}

public class demoLambdaExpression {
    public static void main(String[] args) {
        Hello h = () -> {
            System.out.println("Hi");
        };
        h.sayHello();

        Greeting1 g = (name) -> System.out.println("hi " + name);
        g.sayHello("minh");
    }
}
