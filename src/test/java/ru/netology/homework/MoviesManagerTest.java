package ru.netology.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoviesManagerTest {

    MoviesManager manager = new MoviesManager();

    private Movie film1 = new Movie(1, "Bladshot", "http://", "actionMovie");
    private Movie film2 = new Movie(2, "Ahead", "http://", "cartoon");
    private Movie film3 = new Movie(3, "HotelBelgrad", "http://", "comedy");
    private Movie film4 = new Movie(4, "Gentlemen", "http://", "actionMovie");
    private Movie film5 = new Movie(5, "InvisibleMan", "http://", "horrors");
    private Movie film6 = new Movie(6, "Trolls", "http://", "cartoon");
    private Movie film7 = new Movie(7, "NumberOne", "http://", "comedy");
    private Movie film8 = new Movie(8, "NumberTwo", "http://", "actionMovie");
    private Movie film9 = new Movie(9, "NumberThree", "http://", "actionMovie");
    private Movie film10 = new Movie(10, "NumberFour", "http://", "actionMovie");

    @Test
    public void inOrderOfAdditionMovies(){
        MoviesManager manager = new MoviesManager();
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);
        manager.addMovie(film7);
        manager.addMovie(film8);
        manager.addMovie(film9);
        manager.addMovie(film10);
        Movie[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};
        Movie[] actual = manager.getMovies();
        assertArrayEquals(expected,actual);
    }

    @Test
    public void lastAddedMovies() {
        MoviesManager manager = new MoviesManager(3);
        manager.addMovie(film1);
        manager.addMovie(film2);
        manager.addMovie(film3);
        manager.addMovie(film4);
        manager.addMovie(film5);
        manager.addMovie(film6);
        manager.addMovie(film7);
        manager.addMovie(film8);
        manager.addMovie(film9);
        manager.addMovie(film10);

        Movie[] actual = manager.findLast();
        Movie[] expected = {film10, film9, film8};

        assertArrayEquals(expected, actual);
    }
}
