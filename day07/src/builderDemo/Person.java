package builderDemo;

public class Person {
    public String name;
    public int age;
    public String address;

    public Person() {}

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static Person builder() {
        return new Person();
    }

    public Person withName(String name) {
        this.name = name;
        return this;
    }

    public Person withAge(int age) {
        this.age = age;
        return this;
    }

    public Person withAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, age, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
