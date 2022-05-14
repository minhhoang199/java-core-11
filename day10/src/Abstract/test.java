package Abstract;

import java.util.ArrayList;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        Dev dev = new Dev(1,"id", "m",200000, 20);
        dev.register();
        System.out.println(dev.calculateSalary());

        Tester tester = new Tester(2, "m", "qe", 5000000, 20);
        tester.register();
        System.out.println(tester.calculateSalary());

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(dev);
        employees.add(tester);

        for (Employee e:employees) {
            System.out.println("Ten = " + e.getName() + " - luong - " + e.calculateSalary());
        }

        //sap xep theo ten
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        for (Employee e:employees) {
            System.out.println(e);
        }

        //sap xep theo luong
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o2.calculateSalary() - o1.calculateSalary();
            }
        });
        for (Employee e:employees) {
            System.out.println("Ten " + e.getName() + " - luong - " + e.calculateSalary());
        }
    }
}
