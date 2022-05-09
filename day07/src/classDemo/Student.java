package classDemo;

public class Student {
    public String name;
    public Genger gender;
    public int age;

    public static String school = "TST";

    public Student() {
    }

    public Student(String name) {
        System.out.println("con1");
        this.name = name;
    }

    public Student(String name, Genger gender) {
        this(name);
        System.out.println("gen2");
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public Student(String name, Genger gender, int age) {
        this(name, gender);
        System.out.println("con3");
        this.age = age;
    }

    public static void sayHello() {
        System.out.println("Hello");
    }
}
