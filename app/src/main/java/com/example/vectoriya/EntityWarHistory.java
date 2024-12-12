package com.example.vectoriya;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "users")
public class EntityWarHistory {
    @PrimaryKey
    public int _id;
    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name = "year")
    public int year;
}
