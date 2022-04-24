import java.util.Scanner;

public class homework {
    //bai1
    public static void cloneString(String a) {
        for (int i = 0; i < 10; i++) {
            System.out.print(a);
        }
    }

    //bai2
    public static void repeatString(String a) {
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
            System.out.print(a);
            }
            else {
                System.out.print("-" + a);
            }
        }
    }

    //bai3
    public static void repeatStringForTimes(String a, int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.print(a);
            }
            else {
                System.out.print("-" + a);
            }
        }
    }

    //bai4
    public static int calculateSum() {
        int result = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0) {
                 result += i;
                System.out.println(i);
            }
        }
        return result;
    }

    //bai5
    public static double calculateGlobularVolume(double r) {
        return 4/3 * r * Math.PI;
    }

    //bai6
    public static void printFizzBuzz() {
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("Buzz");
            }
            else if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input string");
        String a = sc.nextLine();
        //b1
        cloneString(a);
        System.out.println(" ");
        System.out.println("--------------------");
        //b2
        repeatString(a);
        System.out.println(" ");
        System.out.println("--------------------");
        //b3
        System.out.println("Input the number of repeat times");
        int times = sc.nextInt();
        repeatStringForTimes(a, times);
        System.out.println(" ");
        System.out.println("--------------------");
        //b4
        System.out.println("sum = " + calculateSum());
        System.out.println("--------------------");
        //b5
        System.out.println("Input r");
        double r = sc.nextDouble();
        System.out.println("Globular volume = " + calculateGlobularVolume(r));
        System.out.println("--------------------");
        //b6
        printFizzBuzz();
    }
}
