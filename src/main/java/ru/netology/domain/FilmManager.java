package ru.netology.domain;

public class FilmManager {
    private int limitFilms = 10;
    private Films[] filmsList = new Films[0];

    public FilmManager() {
    }

    public FilmManager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public Films[] getFilmsList() {
        return filmsList;
    }

    public void setFilmsList(Films[] filmsList) {
        this.filmsList = filmsList;
    }

    public int getLimitFilms() {
        return limitFilms;
    }

    public void setLimitFilms(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    // добавление фильма
    public void addFilm(Films filmAdd) {
        int length = filmsList.length + 1;
        Films[] tmp = new Films[length];
        System.arraycopy(filmsList, 0, tmp, 0, filmsList.length);
        int addFilm = tmp.length - 1;
        tmp[addFilm] = filmAdd;
        filmsList = tmp;
    }


    // вывод в обратном порядке
    public Films[] findLast() {
        int resultLength;

        if (filmsList.length <= limitFilms) {
            resultLength = filmsList.length;
        } else {
            resultLength = limitFilms;
        }
        Films[] result = new Films[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = filmsList.length - i - 1;
            result[i] = filmsList[index];
        }
        return result;
    }

    public Films[] findAll() {
        Films[] result = new Films[filmsList.length];
        System.arraycopy(filmsList, 0, result, 0, result.length);
        return result;
    }
}