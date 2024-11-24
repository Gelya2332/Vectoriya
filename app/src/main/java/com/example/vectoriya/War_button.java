package com.example.vectoriya;

public class War_button {
    private String name; // название
    private String year;  // столица
    private boolean flag_check;
    private boolean flag_color;

    public War_button(String name){
        this.name = name;
        this.year = "0";
        this.flag_check = false;
        this.flag_color = false;
    }

    public String getName() {
        return this.name;
    }

    public String getYear() {
        return this.year;
    }

    public boolean getFlag_check() {
        return this.flag_check;
    }
    public void setFlag_check() {
        this.flag_check = flag_check;
    }
    public void setFlag_color() {
        this.flag_color = flag_color;
    }
    public boolean getFlag_color() {
        return this.flag_color;
    }
}