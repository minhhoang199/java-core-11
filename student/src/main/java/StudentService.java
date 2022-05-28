import java.util.*;
import java.util.stream.Collectors;

public class StudentService {
    List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
        studentList.add(new Student(1, 10, gender.MALE, "minh1"));
        studentList.add(new Student(2, 11, gender.FEMALE, "minh2"));
        studentList.add(new Student(3, 12, gender.MALE, "minh3"));
        studentList.add(new Student(4, 13, gender.FEMALE, "lyly1"));
        studentList.add(new Student(5, 14, gender.MALE, "Jyly2"));
        studentList.add(new Student(6, 15, gender.MALE, "minmin"));
    }

    //Viết method tính thứ hạng trung bình của cả lớp
    public int calculateAverageGrade() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        int total = studentList.stream().map(a -> a.getGrade()).reduce(0, (a, b) -> a + b);
        return total / studentList.size();
    }

    //Viết method tính thứ hạng trung bình của nam trong lớp
    public int calculateAverageGradeOfMale() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        int total = studentList.stream().filter(a -> a.getGender() == gender.MALE).map(a -> a.getGrade()).reduce(0, (a, b) -> a + b);
        return total / studentList.size();
    }

    //Viết method tính thứ hạng trung bình của Nữ trong lớp
    public int calculateAverageGradeOfFemale() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        int total = studentList.stream().filter(a -> a.getGender() == gender.FEMALE).map(a -> a.getGrade()).reduce(0, (a, b) -> a + b);
        return total / studentList.size();
    }

    //Viết method tìm học viên Nam có thứ hạng cao nhất trong lớp
    public Student getBestGradeMaleStudent() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream()
                .filter(a -> a.getGender() == gender.MALE)
                .max(((o1, o2) -> o1.getGrade() - o2.getGrade()))
                .orElseThrow(() -> {
                    throw new NotFoundException("Not found exception");
                });
    }

    //Viết method tìm học viên Nữ có thứ hạng cao nhất trong lớp
    public Student getBestGradeFemaleStudent() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream()
                .filter(a -> a.getGender() == gender.FEMALE)
                .max(((o1, o2) -> o1.getGrade() - o2.getGrade()))
                .orElseThrow(() -> {
                    throw new NotFoundException("Not found exception");
                });
    }

    //Viết method tìm học viên Nam có thứ hạng thấp nhất trong lớp
    public Student getLowestGradeMaleStudent() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream()
                .filter(a -> a.getGender() == gender.MALE)
                .min(((o1, o2) -> o1.getGrade() - o2.getGrade()))
                .orElseThrow(() -> {
                    throw new NotFoundException("Not found exception");
                });
    }
    //Viết method tìm học viên Nữ có thứ hạng thấp nhất trong lớp
    public Student getLowestGradeFemaleStudent() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream()
                .filter(a -> a.getGender() == gender.MALE)
                .min(((o1, o2) -> o1.getGrade() - o2.getGrade()))
                .orElseThrow(() -> {
                    throw new NotFoundException("Not found exception");
                });
    }
    //Viết method thứ hạng cao nhất của cả lớp
    public Student getBestGradeStudent() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream()
                .max(((o1, o2) -> o1.getGrade() - o2.getGrade()))
                .orElseThrow(() -> {
                    throw new NotFoundException("Not found exception");
                });
    }
    //Viết method thứ hạng thấp nhất của cả lớp
    public Student getLowestGradeStudent() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream()
                .min(((o1, o2) -> o1.getGrade() - o2.getGrade()))
                .orElseThrow(() -> {
                    throw new NotFoundException("Not found exception");
                });
    }
    //Viết method lấy ra danh sách tất cả học viên Nữ trong lớp
    public List<Student> getFemaleStudent() {
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream()
                .filter(a -> a.getGender() == gender.FEMALE)
                .collect(Collectors.toList());
    }

    //Viết method sắp xếp tên học viên theo chiều tăng dần của bảng chữ cái
    public List<Student> sortByName(){
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
    }

    //Viết method sắp xếp thứ hạng học viên theo chiều giảm dần
    public List<Student> sortByGrade(){
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream().sorted(Comparator.comparing(Student::getGrade).reversed()).collect(Collectors.toList());
    }

    //Viết method lấy ra học viên Nữ có tên bắt đầu bằng “J”
    public Student getByName(String firstChar){
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream()
                .filter(a -> a.getName().substring(0,1).equals(firstChar))
                .findFirst()
                .orElseThrow(() -> new NotFoundException("Not found Student"));
    }

    //Viết method lấy ra top 5 người có thứ hạng cao nhất trong lớp
    public List<Student> get5HighestGrade(){
        if (studentList.isEmpty()) throw new NotFoundException("List is Empty");
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getGrade).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.get5HighestGrade().forEach(System.out::println);

    }
}
