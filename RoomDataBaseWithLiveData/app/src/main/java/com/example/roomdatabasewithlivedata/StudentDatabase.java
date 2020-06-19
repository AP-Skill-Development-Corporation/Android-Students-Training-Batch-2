package com.example.roomdatabasewithlivedata;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class},version = 1,exportSchema = false)
public abstract class StudentDatabase extends RoomDatabase {

    public abstract StudentDAO myDao();

    public static StudentDatabase INSTANCE;

    public static synchronized StudentDatabase getDataBase(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context,
                    StudentDatabase.class,"MyDb")
                    .allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }

}
