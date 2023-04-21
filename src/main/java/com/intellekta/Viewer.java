package com.intellekta;

public class Viewer {
    private String nikname;

    private int age;

    private int numberOfFilms;

    public Viewer(String nikname, int age, int numberOfFilms) {
        this.nikname = nikname;
        this.age = age;
        this.numberOfFilms = numberOfFilms;
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
