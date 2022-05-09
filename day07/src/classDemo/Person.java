package classDemo;

import java.time.LocalDate;

public class Person {
    //Khai bao thuoc tinh
    public String name;
    public int age;
    public String address;

    public Person(String name, int age, String address) {
        System.out.println("Constructor 3");
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person(String name) {
        System.out.println("Constructor 2");
        this.name = name;
    }

    public Person() {
        System.out.println("Constructor 1");
    }

    //Khai bao phuong thuc
    public void play() {
        System.out.println("playing game");
    }

    public int calculateBirthYear(){
        return LocalDate.now().getYear() - age;
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
