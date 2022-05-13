package service;

import model.Employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class EmployeeService {
    private ArrayList<Employee> employeesList;

    public EmployeeService() {
        this.employeesList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(ArrayList<Employee> employeesList) {
        this.employeesList = employeesList;
    }

    public void showInfo() {
        if (employeesList.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        for (Employee employee : employeesList) {
            System.out.println(employee.toString());
        }
    }

    public void add(Employee employee) {
        employeesList.add(employee);
    }

    public ArrayList<Employee> findByName(String str) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e : employeesList) {
            if (e.getName().toLowerCase(Locale.ROOT).contains(str.toLowerCase(Locale.ROOT))) {
                list.add(e);
            }
        }
        return list;
    }


    public Employee findByID(int id) {
        for (Employee e : employeesList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public void deleteEmployee(int id) {
        Iterator<Employee> iterator = employeesList.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getId() == id) {
                iterator.remove();
            }
        }
    }

    public ArrayList<Employee> findBySalary(int max, int min) {
        ArrayList<Employee> list = new ArrayList<>();
        for (Employee e : employeesList) {
            if (e.getSalary() <= max && e.getSalary() >= min) {
                list.add(e);
            }
        }
        return list;
    }
}
