import java.util.Locale;

public class ForLoopPractice {
    public static void main(String[] args) {
        System.out.println(checkSymmetricString(" AdC c d a "));
        System.out.println(calculateSumBetween(3, 8));
        System.out.println(calculateSumBetween(8, 3));
        System.out.println(checkPrimeNumber(55));
        System.out.println(sumPrimeNumber(40));
        System.out.println(sumAllDivisors(40));
    }

    // method bai1
    public static boolean checkSymmetricString(String str) {
        str = str.trim().toLowerCase(Locale.ROOT);
        str = str.replaceAll("\\s+", "");
        System.out.println("After clear all spaces, String is " + str);
        boolean isSymmetricString = false;
        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length() / 2; i++) {
                String leftChar = String.valueOf(str.charAt(i));
                String rightChar = String.valueOf(str.charAt(str.length() - 1 -i)) ;
                if (leftChar.equalsIgnoreCase(rightChar)) {
                    isSymmetricString = true;
                }
            }
        }
        return isSymmetricString;
    }

    //method bai2
    public static int calculateSumBetween(int a, int b) {
        int result = 0;
        if (a == b) {
            result = 0;
        }
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                result += i;
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                result += i;
            }
        }
        return result;
    }

    //Method bai3
    public static boolean checkPrimeNumber(int a) {
        boolean isPrimeNumber = true;
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                isPrimeNumber = false;
            }
        }
        return isPrimeNumber;
    }

    //method bai 4
    public static int sumPrimeNumber(int a) {
        int sum = 0;
        for (int i = 2; i <= a; i++) {
            boolean isPrimeNumber = true;
            if (i != 2) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrimeNumber = false;
                    }
                }
            }
            if (isPrimeNumber == true) {
                sum += i;
                System.out.print(i + "\t");
            }
        }
        return sum;
    }

    //method bai5
    public static int sumAllDivisors(int a) {
        int sum = 0;
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum += i;
                System.out.print(i + "\t");
            }
        }
        return sum;
    }
}
