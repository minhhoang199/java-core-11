package service;

import exception.NotFoundException;
import lombok.Getter;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter

public class StudentService {
    //Tao list student
    private List<Student> studentList;

    public StudentService() {
        studentList = new ArrayList<>();
        studentList.add(new Student("minh1", 10));
        studentList.add(new Student("m2", 13));
        studentList.add(new Student("m3", 3));
    }

    //1. print list
    public void printStudentList() {
        if (studentList.isEmpty()) throw new NotFoundException("List students is empty");
        studentList.forEach(System.out::println);
    }

    //2. find by name
    public Student findByNmae(String name) {
        Optional<Student> optionalStudent = findStudent(name);
//        if (optionalStudent.isPresent()){
//            return optionalStudent.get();
//        }
//        else throw new NotFoundException("Not found student");
        return optionalStudent.orElseThrow(() -> {
            throw new NotFoundException("Not found student");
        });
    }

    //3. find by age

    //4. Remove by name
    public void deleteStudent(String name){
        if (findStudent(name).isEmpty()){
            throw new NotFoundException("Not found student");
        }
        //studentList.removeIf(student -> student.getName().equals(name.trim().replaceAll("\\s++", "")));
        studentList.remove(findStudent(name).get());
    }

    //Helper method
    public Optional<Student> findStudent(String name) {
        return studentList.stream().filter(student -> student.getName().contains(name.trim().replaceAll("\\s++", ""))).findFirst();
    }

    public static void main(String[] args) {
        StudentService service = new StudentService();
        try {
            service.deleteStudent("m2");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        service.getStudentList().forEach(System.out::println);
    }
}
