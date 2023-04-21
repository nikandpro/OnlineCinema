package com.intellekta;

import java.util.ArrayList;

public class Viewer {
    private String nikname;

    private int age;

    private int numberOfFilms;

    private ArrayList<Cinema> filmList;


    public Viewer(String nikname, int age, ArrayList<Cinema> cinemas) {
        this.nikname = nikname;
        this.age = age;
        if (cinemas!=null) this.numberOfFilms = cinemas.size();
        else this.numberOfFilms=0;
        this.filmList = cinemas;
    }

    public ArrayList<Cinema> getFilmList() {
        return filmList;
    }

    public void setFilmList(ArrayList<Cinema> filmList) {
        this.filmList = filmList;
    }

    public String getNikname() {
        return nikname;
    }

    public void setNikname(String nikname) {
        this.nikname = nikname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public void setNumberOfFilms(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }
}
