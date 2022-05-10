package main;

import model.Movie;
import service.manageFilm;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        manageFilm mf = new manageFilm();
        System.out.println(Arrays.toString(mf.createListMovie()));
        System.out.println("-------------------------------");
        System.out.println(Arrays.toString(mf.createListSerial()));
        System.out.println("-------------------------------");
        mf.fineByTitleMovie("vie1");
        System.out.println("-------------------------------");
        mf.fineByTitleMovie("sadf");
        System.out.println("-------------------------------");
        mf.fineByTitleSerial("al3");
        System.out.println("-------------------------------");
        mf.fineByTitleSerial("asdfsd");

    }
}
