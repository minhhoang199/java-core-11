package service;

import model.Student;

public interface StudentService {
    void showInfo();
    Student add();
    Student updatePoint(String name, double newPoint);
    Student removeStudent(String name);
    void showInfoByClass(String classRoom);
    void sortByName();
    void sortByAge();
    void sortByPoint();
}
