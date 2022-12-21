package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQLOpenHelper extends SQLiteOpenHelper {
    static final String DATABASENAME = "Class";
    static final int DATABASE_VERSION=1;
    public SQLOpenHelper(@Nullable Context context) {
        super(context, DATABASENAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE \"student\" (\n" +
                "\t\"_id\"\tINTEGER,\n" +
                "\t\"name\"\tTEXT NOT NULL,\n" +
                "\t\"grade\"\tREAL NOT NULL\n" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    sqLiteDatabase.execSQL("");
    }
}
