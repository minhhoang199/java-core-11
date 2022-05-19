package service;

import com.google.gson.Gson;
import exception.NotFound;
import lombok.Getter;
import model.Movie;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

@Getter

public class MovieService {
    private List<Movie> listMovie;

    public MovieService() {
        this.listMovie = getMovies("movie.json");
    }

    //lay thong tin phim tu file
    public List<Movie> getMovies(String path) {
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(path));

            listMovie = Arrays.asList(gson.fromJson(reader, Movie[].class));
            reader.close();
            if (listMovie.isEmpty()) throw new NotFound("file is empty");
            return listMovie;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }


    //sap xep
    public void sortByName() {
        if (listMovie.isEmpty()) throw new NotFound("List is empty");

        listMovie.sort(new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle()) > 0 ? 1 : -1;
            }
        });
    }

    public void sortByLength() {
        if (listMovie.isEmpty()) throw new NotFound("List is empty");

        Collections.sort(listMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getLength() - o2.getLength();
            }
        });

    }

    public void sortByView() {
        if (listMovie.isEmpty()) throw new NotFound("List is empty");

        Collections.sort(listMovie, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getView() - o2.getView();
            }
        });

    }


    public Map<String, Integer> countNumberMovieOfCategory() {
        if (listMovie.isEmpty()) throw new NotFound("List is empty");
        Map<String, Integer> listResult = new HashMap<>();

        for (Movie movie:listMovie) {
            for (int i = 0; i < movie.getCategory().length; i++) {
                if (listResult.containsKey(movie.getCategory()[i])){
                    int newValue = listResult.get(movie.getCategory()[i]) + 1;
                    listResult.put(movie.getCategory()[i], newValue);
                }
                else {
                    listResult.put(movie.getCategory()[i], 1);
                }
            }
        }
        return listResult;
    }
}



