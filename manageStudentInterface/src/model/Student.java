package model;

public class Student {
    private int id, age;
    private String name, address, classroom;
    private double point;

    public Student() {
    }

    public Student(int id, int age, String name, String address, String classroom, double point) {
        this.id = id;

        if (age < 5) {
            System.out.println("Age can not be smaller than 5");
        }
        this.age = age;
        this.name = name;
        this.address = address;
        this.classroom = classroom;

        if (point < 0) {
            System.out.println("Point can not be smaller than 0");
        }
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", classroom='" + classroom + '\'' +
                ", point=" + point +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAge(int age) {
        if (age < 5) {
            System.out.println("Age can not be smaller than 5");
            return;
        }
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setPoint(double point) {
        if (point < 0) {
            System.out.println("Point can not be smaller than 0");
            return;
        }
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getClassroom() {
        return classroom;
    }

    public double getPoint() {
        return point;
    }
}
