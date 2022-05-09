package Service;

import Model.Book;

import java.time.LocalDate;

public class BookService {
    //public Book[] books;
    public Book[] getBook() {

        //creat array
        Book[] books = {
                new Book(1, "book1", "minh", "type1", "kim dong", 2000),
                new Book(2, "Đắc nhân tâm", "Tô Hoài", "trinh thám", "Tuổi trẻ", 2022),
                new Book(3, "Deep work", "Thu Hằng", "kỹ năng sống", "Phụ nữ", 2021),
                new Book(4, "Rèn luyện tư duy phản biện", "Minh Duy", "tiểu thuyết", "Kim Đồng", 2022),
                new Book(5, "Nghìn lẻ một đêm", "Minh Trí", "trinh thám", "Phụ nữ", 2019),
        };
        return books;
    }

    public void findByTitle(String title){
        int count = 0;
        for (int i = 0; i < getBook().length; i++){
            if (getBook()[i].title.contains(title)) {
                System.out.println(getBook()[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no book have title is " + title);
        }
    }

    public void findByCategory(String category){
        int count = 0;
        for (int i = 0; i < getBook().length; i++){
            if (getBook()[i].category.contains(category)) {
                System.out.println(getBook()[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no book have category is " + category);
        }
    }

    public void findPublishingOfThisYear() {
        int currentYear = LocalDate.now().getYear();
        int count = 0;
        for (int i = 0; i < getBook().length; i++){
            if (getBook()[i].year == currentYear) {
                System.out.println(getBook()[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no book publishing in this year");
        }
    }


}
