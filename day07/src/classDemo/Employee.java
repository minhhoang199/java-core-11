package classDemo;

public class Employee {
    public String name;
    public int age;
    public String address;
    public int totalHours;

    public Employee() {}

    public Employee(String name, int age, String address, int totalHours) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.totalHours = totalHours;
    }

    public void printInfo() {
        System.out.println(name + " - " + age + " - " + address + " - " + totalHours );
    }

    public int getSalary() {
        int salary = this.totalHours * 200000;
        if (this.totalHours >= 200) {
            return salary + salary * 20 / 100;
        }
        else if (this.totalHours >= 100 && this.totalHours < 200) {
            return salary + salary * 10 / 100;
        }
        else
            return salary;
    }
}
