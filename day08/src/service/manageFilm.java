package service;

import model.Movie;
import model.Serial;
import model.day;

public class manageFilm {
    public manageFilm() {}

    public Movie[] createListMovie() {
        Movie[] arr = {
                new Movie(20001, "movie1", "Action", "James cameron", new day(3,3,1999), 2.5),
                new Movie(20002, "movie2", "Detective", "Conan Doyle", new day(1,5,1988), 2.0),
                new Movie(20003, "movie3", "History", "Zack Synder", new day(9,11,2001), 4.5)
        };
        return arr;
    }

    public Serial[] createListSerial() {
        Serial[] arr = {
                new Serial(30001, "Serial1", "Action", "James cameron", new day(22,6,2000),50, 0.5),
                new Serial(30002, "Serial2", "Detective", "Conan Doyle", new day(1,7,1888), 7, 0.75 ),
                new Serial(30003, "Serial3", "History", "Zack Synder", new day(9,5,2020), 10, 1.5)
        };
        return arr;
    }


    //Tim movie theo title
    public void fineByTitleMovie(String title) {
        int count = 0;
        for (int i = 0; i < createListMovie().length; i++) {
            if (createListMovie()[i].getTitle().contains(title)) {
                System.out.println(createListMovie()[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no movie have title is " + title);
        }
    }

    ////Tim serial theo title
    public void fineByTitleSerial(String title) {
        int count = 0;
        for (int i = 0; i < createListSerial().length; i++) {
            if (createListSerial()[i].getTitle().contains(title)) {
                System.out.println(createListSerial()[i]);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There are no serial have title is " + title);
        }
    }
}
