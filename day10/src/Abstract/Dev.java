package Abstract;

public class Dev extends Employee {
    public int overTimeHours;

    public Dev() {}

    public Dev(int id, String name, String email, int basicSalary, int overTimeHours) {
        super(id, name, email, basicSalary);
        this.overTimeHours = overTimeHours;
    }

    @Override
    int calculateSalary() {
        return getBasicSalary() + overTimeHours * 200000;
    }
}
