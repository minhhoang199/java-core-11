package controller;

import model.Employee;
import service.EmployeeService;
import service.EmployeeService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EmployeeController {
    private final EmployeeService employeeService = new EmployeeService();

    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {
            printMenu();
            option = Integer.parseInt(sc.nextLine());


            switch (option) {
                case 1: {
                    employeeService.showInfo();
                    break;
                }
                case 2: {
                    System.out.println("Input name");
                    String name = sc.nextLine();

                    System.out.println("Input email");
                    String email = sc.nextLine();

                    System.out.println("Input salary");
                    int salary = Integer.parseInt(sc.nextLine());

                    Random rd = new Random();

                    Employee e = new Employee(rd.nextInt(100) + 1, salary, name, email);
                    employeeService.add(e);
                    break;
                }

                case 3: {
                    System.out.println("Input name");
                    String name = sc.nextLine();
                    if (employeeService.findByName(name).isEmpty()) {
                        System.out.println("There is not this employee in the list");
                    } else {
                        System.out.println(Arrays.toString(employeeService.findByName(name).toArray()));
                    }
                    break;
                }
                case 4: {
                    System.out.println("Input ID");
                    int id = Integer.parseInt(sc.nextLine());
                    if (employeeService.getEmployeesList().isEmpty()) {
                        System.out.println("List is empty");
                    }
                    if (employeeService.findByID(id) == null) {
                        System.out.println("There is not this employee in the list");
                    } else {
                        System.out.println(employeeService.findByID(id).toString());
                    }
                    break;
                }
                case 5: {
                    System.out.println("Input ID");
                    int id = Integer.parseInt(sc.nextLine());
                    if (employeeService.getEmployeesList().isEmpty()) {
                        System.out.println("List is empty");
                    }
                    if (employeeService.findByID(id) == null) {
                        System.out.println("There is not this employee in the list");
                    } else {
                        employeeService.deleteEmployee(id);
                    }
                    break;
                }
                case 6: {
                    System.out.println("Input max");
                    int max = Integer.parseInt(sc.nextLine());
                    System.out.println("Input min");
                    int min = Integer.parseInt(sc.nextLine());
                    if (employeeService.findBySalary(max, min).isEmpty()) {
                        System.out.println("There is not this employee in the list");
                    } else {
                        System.out.println(Arrays.toString(employeeService.findBySalary(max, min).toArray()));
                    }
                    break;
                }
            }
        }
        while (option != 0);
    }


    public void printMenu() {
        System.out.println("***********Menu**********");
        System.out.println("1. In thông tin của tất cả nhân viên");
        System.out.println("2. Thêm nhân viên mới (Thông tin của nhân viên được nhập vào từ bàn phím)");
        System.out.println("3. Tìm kiếm nhân viên theo name");
        System.out.println("4. Tìm kiếm nhân viên theo id");
        System.out.println("5. Xóa nhân viên theo id");
        System.out.println("6. Tìm kiếm nhân viên có mức lương từ 5.000.000 --> 10.000.000");
        System.out.println("0. Thoát");

    }
}
