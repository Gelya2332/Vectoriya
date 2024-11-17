package com.example.vectoriya;

public class Person {
    private final String name;
    private int rating;

    Person(String name, int rating){
        this.name = name;
        this.rating = rating;
    }
    public void setRating(int count) {
        this.rating = count;
    }

    public int getRating() {
        return rating;
    }
    public String getName(){
        return this.name;
    }
}
