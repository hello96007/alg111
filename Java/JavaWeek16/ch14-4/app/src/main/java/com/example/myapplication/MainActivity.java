package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    SQLiteDatabase db;
    SQLOpenHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOnClick(View view)
    {
        dbhelper = new SQLOpenHelper(this);
        db = dbhelper.getWritableDatabase();
        TextView textView = findViewById(R.id.txtview);
        textView.setText("db open"+db.isOpen()+"\n資料庫版本"+db.getVersion());
    }
}