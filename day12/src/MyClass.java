public class MyClass<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public MyClass(T obj) {
        this.obj = obj;
    }

    //method Generic
    public <U extends Number> void demoMethod(U data){
        System.out.println("demo");
    }

    public static void main(String[] args) {
        MyClass<Integer> myClass = new MyClass<>(10);
        System.out.println(myClass.getObj());

        MyClass<? extends Number> myClass1 = new MyClass<>(10.4);
        Student st = new Student(10, "minh");
        MyClass<Student> myClass2 = new MyClass<>(st);
        System.out.println(myClass2.getObj());

        myClass.demoMethod(10);
        myClass1.demoMethod(20.5);
    }
}
