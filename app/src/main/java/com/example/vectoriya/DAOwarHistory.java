package com.example.vectoriya;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface DAOwarHistory {
    @Query("SELECT name FROM users WHERE _id = :id")
    public String getText(int id);
    @Query("SELECT year FROM users WHERE _id = :id")
    public String getYear(int id);
}