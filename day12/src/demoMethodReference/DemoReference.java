package demoMethodReference;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface Hello{
    void display();
}

public class DemoReference {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(10, "minh1"));
        students.add(new Student(12, "minh2"));

        students.forEach(student -> System.out.println(student));
        students.forEach(System.out::println);


        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        students.sort(Comparator.comparing(Student::getName));
        students.sort(Comparator.comparing(Student::getName).reversed());
        students.forEach(System.out::println);

        Student st = new Student(1, "An");
        Hello h = () -> System.out.println(st.getName() + " - " + st.getAge());

    }
}
