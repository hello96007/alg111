package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{
    private  float original_size = 20;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output=findViewById(R.id.Output);
       // output.setTextSize(original_size);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
        button.setOnLongClickListener(this);
    }
    public int i = 0 ;
    @Override
    public void onClick(View view) {
        float size = output.getTextSize();
        output.setTextSize(size+5);

        }

    @Override
    public boolean onLongClick(View view) {
        output.setTextSize(original_size);
        return true;
    }
}