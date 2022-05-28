import lombok.*;

enum gender{
    MALE, FEMALE;
}

@ToString
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Student {
    private int id;
    private int grade;
    private gender gender;
    private String name;
}
