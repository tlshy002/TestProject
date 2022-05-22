package com.example.todolist_ex1;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {MainData.class}, version = 1, exportSchema = false)
public abstract class RoomDB extends RoomDatabase {

    private static RoomDB database;
    private static String DATABASE_NAME = "database";

    public synchronized static RoomDB getInstance(Context context)
    {
        if (database == null)
        {
            database = Room.databaseBuilder(context.getApplicationContext(), RoomDB.class, DATABASE_NAME)
                    .allowMainThreadQueries() // 메인 스레드에서 DB에 입출력을 가능하게 함
                    .fallbackToDestructiveMigration() // 스키마(데이터베이스) 버전 변경가능
                    .build();
        }
        return database;
    }

    public abstract MainDao mainDao();
}
