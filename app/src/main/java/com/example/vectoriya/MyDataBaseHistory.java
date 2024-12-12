package com.example.vectoriya;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {EntityWarHistory.class}, version = 1)
public abstract class MyDataBaseHistory extends RoomDatabase {

    public abstract DAOwarHistory myDao();

}