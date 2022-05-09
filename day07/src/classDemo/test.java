package classDemo;

public class test {
    public static void main(String[] args) {
        Student st1 = new Student("minh", Genger.MALE, 23);
        System.out.println(st1.toString());

        System.out.println(Student.school);
        Student.sayHello();
    }
}
