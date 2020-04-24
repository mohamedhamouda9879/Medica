package com.example.medica.DataBaseRoom;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {QuizModel.class}, version = 1, exportSchema = false)
public abstract class MyDataBase extends RoomDatabase {

    public abstract QuizDao QuizDAo();

    private static MyDataBase myDataBase;

    public static MyDataBase getInstance(Context context) {

        if (myDataBase == null) {
            myDataBase = Room.databaseBuilder(context.getApplicationContext(),
                    MyDataBase.class, "M_Database")
                    .allowMainThreadQueries()
                    .build();

        }
        return myDataBase;
    }

}
