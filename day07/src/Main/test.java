package Main;

import Model.Book;
import Service.BookService;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        BookService bs = new BookService();


        do {
            System.out.println("-------------------------------");
            System.out.println("Input a number to chose a function: \n" +
                    "1.Create an array to manage books \n" +
                    "2.Find books by title \n" +
                    "3.Find books by category \n" +
                    "4.List books which were published in this year \n" +
                    "0.Quit \n");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1: {
                    System.out.println(Arrays.toString(bs.getBook()));
                    break;
                }
                case 2:{
                    System.out.println("Input a title:");
                    String title = sc.nextLine();
                    bs.findByTitle(title);
                    break;
                }
                case 3:{
                    System.out.println("Input a category:");
                    String category = sc.nextLine();
                    bs.findByCategory(category);
                    break;
                }
                case 4: {
                    System.out.println("Books which were published in this year are: ");
                    bs.findPublishingOfThisYear();
                    break;
                }
            }

        }while (option != 0);
    }
}
