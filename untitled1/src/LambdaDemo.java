import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaDemo {
    @FunctionalInterface
    interface Hello{
        void sayHello();
    }

    @FunctionalInterface
    interface Calculate{
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
        Student st1 = new Student("minh", 14, 2000);
        Hello h = st1::print;

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("minh1", 1, 3));
        list.add(new Student("minh2", 5, 6));
        list.add(new Student("minh5", 7, 8));

        //c1: anonymous class
        list.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });

        //c2: khai bao 1 object consumer
        //c3: lambda expression
        list.forEach(st -> System.out.println(st));

        //c4: reference method
        list.forEach(System.out::println);

        list.removeIf(st -> st.getName().equals("minh"));
        list.stream().map(new Function<Student, Student>() {
            @Override
            public Student apply(Student student) {
                student.setName(student.getName().toUpperCase(Locale.ROOT));
                return student;
            }
        });
        list.stream().map(st ->
        {st.setName(st.getName().toUpperCase(Locale.ROOT));
        return st;
    }).forEach(System.out::println);
    }
}
