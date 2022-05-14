package service;

import model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class StudentServiceImpl implements StudentService {
    ArrayList<Student> students = new ArrayList<>();


    @Override
    public void showInfo() {
        for (Student st : students) {
            System.out.println(st);
        }
    }

    @Override
    public Student add() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input name");
        String name = sc.nextLine();
        //xử lý chuỗi
        name = name.trim().toLowerCase(Locale.ROOT).replace("\\s+", " ");
        String[] arr = name.split(" ");
        name = "";
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                name += " ";
            }
            name += String.valueOf(arr[i].charAt(0)).toUpperCase(Locale.ROOT) + arr[i].substring(1);
        }

        System.out.println("Input address");
        String address = sc.nextLine();

        System.out.println("Input age");
        int age = Integer.parseInt(sc.nextLine());

        System.out.println("Input class");
        String classRoom = sc.nextLine();

        System.out.println("Input point");
        double point = Double.parseDouble(sc.nextLine());

        int id;
        if (students.isEmpty()) {
            id = 1;
        } else {
            id = students.get(students.size() - 1).getId() + 1;
        }
        Student newSt = new Student(id, age, name, address, classRoom, point);
        students.add(newSt);

        return newSt;
    }

    @Override
    public Student updatePoint(String name, double newPoint) {
        Scanner sc = new Scanner(System.in);
        //Trường hợp cso nhiều học sinh trùng tên
        System.out.println("List student have name is " + name);
        for (Student st : findByName(name)) {
            System.out.println(st);
        }
        System.out.println("=> Pick student need to be updated by id");
        int id = Integer.parseInt(sc.nextLine());
        Student st = new Student();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.get(i).setPoint(newPoint);
                st = students.get(i);
                break;
            }
        }
        return st;
    }

    //Tim ra các học sinh trùng tên
    private ArrayList<Student> findByName(String name) {
        ArrayList<Student> list = new ArrayList<>();
        for (Student st : students) {
            if (st.getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                list.add(st);
            }
        }
        return list;
    }

    @Override
    public Student removeStudent(String name) {
        Scanner sc = new Scanner(System.in);
        //Trường hợp cso nhiều học sinh trùng tên
        System.out.println("List student have name is " + name);
        for (Student st : findByName(name)) {
            System.out.println(st);
        }
        System.out.println("=> Pick student need to be removed by id");
        int id = Integer.parseInt(sc.nextLine());
        Student st = new Student();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                st = students.get(i);
                students.remove(st);
                break;
            }
        }
        return st;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public void showInfoByClass(String classRoom) {
        for (Student st : students) {
            if (st.getClassroom().toLowerCase(Locale.ROOT).equals(classRoom.toLowerCase(Locale.ROOT))) {
                System.out.println(st);
            }
        }
    }

    @Override
    public void sortByName() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    public void sortByAge() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    @Override
    public void sortByPoint() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.getPoint() - o2.getPoint());
            }
        });
    }
}
