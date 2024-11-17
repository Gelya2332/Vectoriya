package com.example.vectoriya;

import android.widget.TextView;

public class Person {

    private final String name;
    private int rating;

    Person(String name){
        this.name = name;
        this.rating = 0;
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
