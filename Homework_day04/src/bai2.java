import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    //Bài về nhà số 2 + thực hành array

    //Method tạo array
    public static int[] createArray() {
        System.out.println("Input Array length");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input index " + (i + 1));
            int index = sc.nextInt();
            numbers[i] = index;
        }
        return numbers;
    }

    //Method in ra các phần tử trong mảng
    public static void printAllIndexes(int[] arr) {
        for (int index : arr) {
            System.out.print(index + "\t");
        }
    }

    //Method tính tổng
    public static int sum(int[] arr) {
        int total = 0;
        for (int number : arr) {
            total += number;
        }
        return total;
    }

    //Method tìm max
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //Method tìm min
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //Method đếm số phần tử chẵn
    public static int countEvenIndex(int[] arr) {
        int count = 0;
        for (int index : arr) {
            if (index % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Method đếm số phần tử lẻ
    public static int countOddIndex(int[] arr) {
        int count = 0;
        for (int index : arr) {
            if (index % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    //Method cộng 1 đơn vị với phần tử số chẵn
    public static void addEvenIndex(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selectedNumber = 0;
        int[] numbers = new int[0];
        //Nhap

        do {
            System.out.println("Input a number to select the function");
            System.out.println("1. Tạo mảng số nguyên gồm n phần tử với n nhập vào từ bàn phím\n" +
                    "2. In ra các phần tử trong mảng\n" +
                    "3. Tính tổng các phần tử trong mảng\n" +
                    "4. Tìm phần tử nhỏ nhất\n" +
                    "5. Tìm phần tử lớn nhất\n" +
                    "6. Đếm số lượng phần tử chẵn\n" +
                    "7. Đếm số lượng phần tử lẻ\n" +
                    "8. Thay đổi các phần tử là số chẵn trong mảng tăng lên 1 phần tử\n" +
                    "0. Thoát khỏi chương trình\n");
            selectedNumber = Integer.parseInt(sc.nextLine());
            ;
            switch (selectedNumber) {
                case 1: {
                    numbers = createArray();
                    break;
                }
                //In ra các phần tử trong mảng
                case 2: {
                    System.out.println(Arrays.toString(numbers));
                    break;
                }

                //tinh tong
                case 3: {
                    System.out.println("sum: " + sum(numbers));
                    break;
                }

                //min
                case 4: {
                    System.out.println("min: " + findMin(numbers));
                    break;
                }

                //max
                case 5: {
                    System.out.println("max: " + findMax(numbers));
                    break;
                }

                //dem chan
                case 6: {
                    System.out.println("The number of even indexes is " + countEvenIndex(numbers));
                    break;
                }
                //dem le
                case 7: {
                    System.out.println("The number of odd indexes is " + countOddIndex(numbers));
                    break;
                }
                //dem le
                case 8: {
                    addEvenIndex(numbers);
                    System.out.println("All even indexes have been add 1");
                    break;
                }
            }
        }
        while (selectedNumber != 0);
    }
}
