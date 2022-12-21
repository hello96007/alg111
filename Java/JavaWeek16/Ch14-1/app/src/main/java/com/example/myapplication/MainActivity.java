package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    SharedPreferences perfs;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    perfs = getSharedPreferences("MyPref",MODE_PRIVATE);
    text = findViewById(R.id.input);

    }
    @Override
    protected void onResume()
    {
        super.onResume();
        String tem = perfs.getString("TEM","100");
        text.setText(tem);
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        SharedPreferences.Editor preEdit=perfs.edit();
        preEdit.putString("TEM",text.getText().toString());
    }

    public void btnOnclick(View v)
    {
        Intent intent = new Intent(this,FActivity.class);
        startActivity(intent);
    }
}