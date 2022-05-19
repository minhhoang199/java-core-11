package test;

import exception.NotFound;
import model.Book;

import java.util.ArrayList;
import java.util.Comparator;

public class test {
    public static void main(String[] args) {
        String[] arr1 = {"mm", "ss"};
        Book b1 = new Book(1, "b1", "mm", arr1, 76, 2000);
        Book b2 = new Book(2, "b1", "mm", arr1, 70, 2001);
        Book b3 = new Book(3, "b1", "mm", arr1, 80, 1999);

        ArrayList<Book> listBook = new ArrayList<>();
        listBook.add(b1);
        listBook.add(b2);
        listBook.add(b3);

        System.out.println(listBook.toString());
        sortByReleaseYear(listBook);
        System.out.println(listBook.toString());

    }

    public static void sortByReleaseYear(ArrayList<Book> listBook) {
        if (listBook.isEmpty()) throw new NotFound("List is empty");

        listBook.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getReleaseYear() - o1.getReleaseYear();
            }
        });
    }

    public static void sortByPageNumber(ArrayList<Book> listBook) {
        if (listBook.isEmpty()) throw new NotFound("List is empty");

        listBook.sort(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPageNumber() - o1.getPageNumber();
            }
        });
    }
}
