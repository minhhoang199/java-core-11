import java.util.Arrays;
import java.util.Scanner;

public class MultiArray {
    //method nhap
    public static int[][] createMultipleArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of rows: ");
        int a = sc.nextInt();
        System.out.println("Input the number of collums: ");
        int b = sc.nextInt();
        int[][] arr = new int[a][b]
    }

    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0] = 2;
        arr[0][1] = 4;
        arr[0][2] = 5;

        arr[1][0] = 3;
        arr[1][1] = 5;
        arr[1][2] = 6;

        for (int[] index:arr) {
            System.out.println(Arrays.toString(index));
        }


    }
}
