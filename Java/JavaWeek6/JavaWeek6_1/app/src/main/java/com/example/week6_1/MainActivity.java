package com.example.week6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    float  size = 100;
    TextView see ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        see = findViewById(R.id.word);
        see.setTextSize(this.size);
        Button btn1 = findViewById(R.id.big);
        Button btn2 = findViewById(R.id.small);
        btn1.setOnClickListener(this);
        //btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.big)
        {
            size++;
            see.setTextSize(this.size);
        }
        else
        {
            size--;
            see.setTextSize(this.size);
        }
    }
}