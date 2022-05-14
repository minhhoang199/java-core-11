package Abstract;

public abstract class Employee {
    private int id;
    public String name;
    public String email;
    public int basicSalary;
    public Employee(){}

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", basicSalary=" + basicSalary +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public Employee(int id, String name, String email, int basicSalary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.basicSalary = basicSalary;
    }

    public void register(){
        System.out.println("Employee register....");
    }

    abstract int calculateSalary();
}
