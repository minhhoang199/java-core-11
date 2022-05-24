@FunctionalInterface
interface Calculator{
    int calculate(int a, int b);
}

public class DemoCalculator {
    public static void main(String[] args) {
        Calculator c1 = (a, b) -> a + b;
        System.out.println(c1.calculate(1, 2));

        Calculator c2 = (a, b) -> a - b;
        System.out.println(c2.calculate(1, 2));

        Calculator c3 = (a, b) -> a * b;
        System.out.println(c3.calculate(1, 2));

        Calculator c4 = (a, b) -> a / b;
        System.out.println(c4.calculate(1, 2));
    }
}
