package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilmManagerTest {
    Films one = new Films(1, "One");
    Films two = new Films(2, "Two");
    Films three = new Films(3, "Three");
    Films four = new Films(4, "Four");
    Films five = new Films(5, "Five");
    Films six = new Films(6, "Six");
    Films seven = new Films(7, "Seven");
    Films eight = new Films(8, "Eight");
    Films nine = new Films(9, "Nine");
    Films ten = new Films(10, "Ten");
    Films eleven = new Films(11, "Eleven");

    @Test
    void checkFilmLimit() {
        FilmManager manager = new FilmManager();
        int actual = manager.getLimitFilms();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void addFilm() {
        FilmManager manager = new FilmManager();
        manager.addFilm(one);
        manager.addFilm(two);

        Films[] expected = {one, two};
        Films[] actual = manager.findAll();

        assertArrayEquals(expected, actual);

    }

    @Test
    public void showNullFilm() {
        FilmManager manager = new FilmManager();
        Films[] expected = {};
        Films[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void addTenFilms() {
        FilmManager manager = new FilmManager();
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);

        Films[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Films[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddAllFilms() {
        FilmManager manager = new FilmManager(11);
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        manager.addFilm(eleven);

        Films[] expected = {one, two, three, four, five, six, seven, eight, nine, ten, eleven};
        Films[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastTenMovies() {
        FilmManager manager = new FilmManager(10);
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);
        manager.addFilm(seven);
        manager.addFilm(eight);
        manager.addFilm(nine);
        manager.addFilm(ten);
        manager.addFilm(eleven);


        Films[] expected = {eleven, ten, nine, eight, seven, six, five, four, three, two};
        Films[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }


    @Test
    public void findLastFiveFilms() {
        FilmManager manager = new FilmManager(5);
        manager.addFilm(one);
        manager.addFilm(two);
        manager.addFilm(three);
        manager.addFilm(four);
        manager.addFilm(five);
        manager.addFilm(six);

        Films[] expected = {six, five, four, three, two};
        Films[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

}