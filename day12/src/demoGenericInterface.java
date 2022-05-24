import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.List;

interface InterfaceGeneric<T> {
    void add(T obj);

    void remove(T obj);

    void print();
}

public class demoGenericInterface<T> implements InterfaceGeneric<T> {
    List<T> list;

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public demoGenericInterface(List<T> list) {
        this.list = list;
    }

    @Override
    public void add(T obj) {
        list.add(obj);
    }

    @Override
    public void remove(T obj) {
list.remove(obj);
    }

    @Override
    public void print() {
        for (T obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        demoGenericInterface<Student> listStudent = new demoGenericInterface<>(new ArrayList<>());
        Student st1 = new Student(10, "minh1");
        Student st2 = new Student(20, "minh2");
        Student st3 = new Student(21, "minh3");

        listStudent.add(st1);
        listStudent.add(st2);
        listStudent.add(st3);
        listStudent.add(st1);

        listStudent.print();
        System.out.println("______________________________");
        listStudent.remove(st3);
        listStudent.print();
    }
}
