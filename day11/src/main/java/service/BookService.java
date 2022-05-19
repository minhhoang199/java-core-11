package service;

import com.google.gson.Gson;
import exception.NotFound;
import lombok.Getter;
import model.Book;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@Getter

public class BookService {
    private List<Book> listBook;

    public BookService() {
        this.listBook = getBooks("book.json");
    }

    //lay thong tin sach
    public List<Book> getBooks(String path) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));

            listBook = Arrays.asList(gson.fromJson(reader, Book[].class));
            reader.close();
            if (listBook.isEmpty()) throw new NotFound("file is empty");
            return listBook;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    //tim theo ten
    public ArrayList<Book> findByName(String name) {
        if (listBook.isEmpty()) throw new NotFound("List is empty");

        ArrayList<Book> list = new ArrayList<>();
        for (Book book : listBook) {
            if (book.getTitle().contains(name)) {
                list.add(book);
            }
        }
        if (list.isEmpty()) throw new NotFound("There are not books have name is " + name);
        return list;
    }

    //tim theo category
    public ArrayList<Book> findByCategory(String category) {
        if (listBook.isEmpty()) throw new NotFound("List is empty");

        ArrayList<Book> list = new ArrayList<>();
        for (Book book : listBook) {
            for (int i = 0; i < book.getCategory().length; i++) {
                if ((book.getCategory()[i].equals(category))) {
                    list.add(book);
                    break;
                }
            }
        }
        if (list.isEmpty()) throw new NotFound("There are not books have category is " + category);
        return list;
    }

    //sap xep
    public void sortByPageNumber() {
        if (listBook.isEmpty()) throw new NotFound("List is empty");

        Collections.sort(this.listBook,new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getPageNumber() - o1.getPageNumber();
            }
        });
    }

    public void sortByReleaseYear() {
        if (listBook.isEmpty()) throw new NotFound("List is empty");

        Collections.sort(this.listBook,new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getReleaseYear() - o1.getReleaseYear();
            }
        });
    }


    public static void main(String[] args) {
        BookService bs = new BookService();


        List<Book> lb = bs.getBooks("book.JSON");
        for (Book book : lb) {
            System.out.println(book);
        }
    }


}
