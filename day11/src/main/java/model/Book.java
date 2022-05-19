package model;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString

public class Book {
    private int id;
    private String title, author;
    private String[] category;
    @SerializedName(value = "page_number")
    private int pageNumber;
    @SerializedName(value = "release_year")
    private int releaseYear;


}
