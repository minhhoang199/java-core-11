public class Main {
    public static int globalVariable = 20;
    public static void main(String[] args) {

        System.out.println("Hello World");


        //Variable
        String firstName, lastName;

        //Khoi tao gia tri cua var
        firstName = "Minh";
        lastName = "Hoang";

        //String fullName = "Minh Hoang";
        String fullName = firstName + " " + lastName;//cong Array
        System.out.println(firstName + lastName);
        System.out.println(fullName);

        int age = 23;
        System.out.println("Hello everyone, I am " + fullName + " and i was born in " + (2022 - age));

        long money = 2_000_000L;
        System.out.println("My account have nothing without " + money + " VND");

        boolean isMale = true;
        System.out.println("isMale = " + isMale + " is a boy");
        System.out.println("isMale = " + !isMale + " is a girl");

        //so thuc
        double weight = 65.5;
        float height = 1.65f;

        System.out.println("My weight is " + weight + " and my height is " + height);

        //char --> search ASCII
        char charA = 'A';
        char a = 97;

        System.out.println(charA);
        System.out.println(a);

        //ep kieu
        int number = 10;
        long number1 = number;
        double number2 = number;

        System.out.println(number1);
        System.out.println(number2);

        // Ep kieu tuong minh
        double d1 = 1.8;
        int d1ValueConvert = (int) d1;
        System.out.println(d1ValueConvert);

        //Pham vi cua variable(Ben trong {})

        System.out.println(globalVariable);
    }
}
