package controller;

import model.Book;
import service.BookService;

import java.util.List;
import java.util.Scanner;

public class BookController {
    BookService bookService = new BookService();

    public void run(){
        Scanner sc = new Scanner(System.in);
        String option = "";
        do {
            printMenu();
            option = sc.nextLine();

            switch (option){
                case "1":{
                    try {
                    List<Book> listBook = bookService.getListBook();
                        for (Book book:listBook) {
                            System.out.println(book);
                        }
                }catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case "2":{
                    try {
                        System.out.println("Input name");
                        String name = sc.nextLine();
                        List<Book> listBookByName = bookService.findByName(name);

                        for (Book book:listBookByName) {
                            System.out.println(book);
                        }
                    } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case "3":{
                    try {
                        System.out.println("Input category");
                        String category = sc.nextLine();
                        List<Book> listBookByCategory = bookService.findByCategory(category);

                        for (Book book:listBookByCategory) {
                            System.out.println(book);
                        }
                    } catch (RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case "4":{
                    System.out.println("Sort by page number");
                    bookService.sortByPageNumber();
                    for (Book book:bookService.getListBook()) {
                        System.out.println(book);
                    }
                    break;
                }

                case "5":{
                    System.out.println("Sort by release year");
                    bookService.sortByReleaseYear();
                    for (Book book:bookService.getListBook()) {
                        System.out.println(book);
                    }
                    break;
                }
            }

        }while (!option.equals("0"));
    }

    private void printMenu(){
        System.out.println("*******Menu********");
        System.out.println("1. Lấy thông tin toàn bộ sách\n" +
                "2. Tim sách theo tên\n" +
                "3. Tìm sách theo thể loại\n" +
                "4. Sắp xếp sách theo số trang\n" +
                "5. Sắp xếp sách theo năm xuất bản\n" +
                "0. Thoát");
    }
}
