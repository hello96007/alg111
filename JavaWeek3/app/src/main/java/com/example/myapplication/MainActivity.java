package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public int count;
    @Override//副類別
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.week3_mainpage);
    }
    public void Add_Button(View view){

    TextView output = (TextView) findViewById(R.id.Label_Output);
    count=Integer.parseInt(output.getText().toString());
    count++;
    output.setText(Integer.toString(count));
    }
    public void Sub_Button(View view){
        TextView output = (TextView) findViewById(R.id.Label_Output);
        count=Integer.parseInt(output.getText().toString());
        count--;
        output.setText(Integer.toString(count));
    }
    public void Return_Button(View view){
        TextView output = (TextView) findViewById(R.id.Label_Output);
        count=Integer.parseInt(output.getText().toString());
        count=0;
        output.setText(Integer.toString(count));
    }
    public void Goto_Counter(View view){
        setContentView(R.layout.activity_main);
    }
    public void Goto_Main(View view){
        finish();
    }
    public void Goto_Edit(View view){
        setContentView(R.layout.editview);
        TextView output = (TextView) findViewById(R.id.Name_Output);
        output.setText("What's your name?");
    }
    public void Print_Name(View view) {
        EditText name = (EditText) findViewById((R.id.Name_Edit));
        String str = name.getText().toString();
        TextView output = (TextView) findViewById(R.id.Name_Output);
        output.setText("你好"+str);
    }
}