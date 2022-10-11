package ru.netology.homework;

public class MoviesManager {
    private Movie[] movies = new Movie[0];
    private int limit;

    public MoviesManager() {
        this.limit = 10;
    }

    public MoviesManager(int limit) {
        this.limit = limit;
    }

    public void addMovie(Movie movie) {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public Movie[] findAll() {
        Movie[] tmp = new Movie[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

    public Movie[] findLast() {
        int resultLength;
        if (limit <= movies.length) {
            resultLength = limit;
        } else {
            resultLength = movies.length;
        }
        Movie[] tmp = new Movie[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }
    public Movie[] getMovies(){
        return movies;
    }

}

