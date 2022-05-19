package model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Movie {
    private int id;
    private String title, director;
    private String[] category;
    private int length;
    private String release;
    private int view;
}
