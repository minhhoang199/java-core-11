package demoOverload;

public class test {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum(1,2,3));
        System.out.println(cal.sum(1.0, 1));

    }
}
