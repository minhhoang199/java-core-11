package controller;

import model.Student;
import service.StudentService;
import service.StudentServiceImpl;

import java.util.Scanner;

public class StudentController {
    StudentServiceImpl service = new StudentServiceImpl();

    public void run() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do {System.out.println("*******Menu**********");
            System.out.println("1. Xem danh sách học sinh\n" +
                    "2. Thêm học sinh mới\n" +
                    "3. Cập nhập điểm học sinh\n" +
                    "4. Xóa học sinh\n" +
                    "5. Xem danh sách học sinh theo lớp\n" +
                    "6. Sắp xếp theo tên\n" +
                    "7. Sắp xếp theo tuổi\n" +
                    "8. Sắp xếp theo điểm\n" +
                    "0. Thoát");
            option = Integer.parseInt(sc.nextLine());
            switch (option){
                case 1:{
                    service.showInfo();
                    break;
                }
                case 2:{
                    Student st = service.add();
                    System.out.println("Student " + st + " has been added");
                    break;
                }
                case 3:{
                    System.out.println("Input student name");
                    String name = sc.nextLine();

                    System.out.println("Input new point");
                    double newPoint = Double.parseDouble(sc.nextLine());
                    System.out.println("Student has been updated is: ");
                    service.updatePoint(name,newPoint);
                    break;
                }
                case 4:{
                    System.out.println("Input student name");
                    String name = sc.nextLine();

                    System.out.println("Student has been removed is: ");
                    service.removeStudent(name);
                    break;
                }
                case 5:{
                    System.out.println("Input class");
                    String classRoom = sc.nextLine();

                    System.out.println("Students in this class are");
                    service.showInfoByClass(classRoom);
                    break;
                }
                case 6:{
                    System.out.println("List was sort by name:");
                    service.sortByName();
                    for (Student st:service.getStudents()) {
                        System.out.println(st);
                    }
                    break;
                }
                case 7:{
                    System.out.println("List was sort by age:");
                    service.sortByAge();
                    for (Student st:service.getStudents()) {
                        System.out.println(st);
                    }
                    break;
                }
                case 8:{
                    System.out.println("List was sort by point:");
                    service.sortByPoint();
                    for (Student st:service.getStudents()) {
                        System.out.println(st);
                    }
                    break;
                }
            }

        }while (option != 0);
    }
}
