package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_click(View v)
    {
        EditText input = (EditText) findViewById(R.id.textName);
        int num = Integer.parseInt(input.getText().toString());
        double result = (9.0*num)/5.0+32.0;
        TextView output = (TextView) findViewById(R.id.Output_label);
        System.out.println("?????"+result);
        output.setText("答案為："+result);
    }
}