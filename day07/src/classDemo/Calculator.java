package classDemo;

public class Calculator {
    public int num1;
    public int num2;

    public void printInfo(){
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }

    public int addition() {
        return num1 + num2;
    }

    public int subtract() {
        return num1 - num2;
    }

    public int multi() {
        return num1 * num2;
    }

    public double division() {
        return (double)num1 / num2;
    }

}
