import java.sql.SQLOutput;
import java.util.Scanner;

public class HomeWord02 {
    //method tính chu vi hình chữ nhật
    public static double calculateRectanglePerimeter(double length, double width) {
        return (length + width) * 2;
    }
    //method tính diện tích hình chữ nhật
    public static double calculateAreaPerimeter(double length, double width) {
        return length * width;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Bài 1
        System.out.println("Input length:");
        double length = sc.nextDouble();
        System.out.println("Input width:");
        double width = sc.nextDouble();
        //In ra console
        System.out.println("Chu vi hình chữ nhật là: " + calculateRectanglePerimeter(length,width));
        System.out.println("Diện tích hình chữ nhật là: " + calculateAreaPerimeter(length,width));

        System.out.println("-------------------------");
        //Bài 2
        System.out.println("Input name: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Input age: ");
        int age = sc.nextInt();

        System.out.println("Input gender: ");
        sc.nextLine();
        String gender = sc.nextLine();

        System.out.println("Input address: ");
        String address = sc.nextLine();

        //In ra console
        System.out.printf("Xin chào các bạn, mình tên là %s, năm nay mình %d tuổi, giới tính %s. Hiện tại mình đang sống và làm việc tại %s \n", name, age, gender, address);

    }
}
