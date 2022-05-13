package model;

public class Employee{
    private int id, salary;
    private String name, email;

    public Employee (int id, int salary, String name, String email) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.email = email;
    }

    public Employee (){}

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
