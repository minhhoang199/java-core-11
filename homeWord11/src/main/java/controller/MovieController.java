package controller;


import model.Movie;
import service.MovieService;

import java.util.Map;
import java.util.Scanner;

public class MovieController {
    MovieService movieService = new MovieService();

    public void run() {
        Scanner sc = new Scanner(System.in);
        String option = "";
        do {
            printMenu();
            option = sc.nextLine();

            switch (option) {
                case "1": {
                    try {
                        for (Movie movie : movieService.getListMovie()) {
                            System.out.println(movie);
                        }
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case "2": {
                    System.out.println("Sort by name");
                    movieService.sortByName();
                    break;
                }

                case "3": {
                    System.out.println("Sort by length");
                    movieService.sortByLength();
                    break;
                }
                case "4": {
                    System.out.println("Sort by view");
                    movieService.sortByView();
                    break;
                }

                case "5": try {
                    Map<String, Integer> listMap = movieService.countNumberMovieOfCategory();
                    for (Map.Entry<String, Integer> entry : listMap.entrySet()) {
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
                    break;
                }

        } while (!option.equals("0"));
    }

    private void printMenu() {
        System.out.println("*******Menu********");
        System.out.println("1. In thông tin các bộ phim ra màn hình\n" +
                "2. Sắp xếp phim theo tên\n" +
                "3. Sắp xếp phim theo thời lượng\n" +
                "4. Sắp xếp phim theo lượt xem\n" +
                "5. Đếm mỗi thể loại có bao nhiêu bộ phim\n" +
                "0. Thoát");
    }
}
