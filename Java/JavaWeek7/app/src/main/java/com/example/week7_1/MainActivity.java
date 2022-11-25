package com.example.week7_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements CompoundButton.OnCheckedChangeListener {
    private TextView textView;
    private int[] checkID = {};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

    }


    /*原始做法
    public void Check_Button(View view)
    {
        String str="";
        CheckBox Beef = findViewById(R.id.Beef);
        CheckBox Pork = findViewById(R.id.Pork);
        CheckBox Chicken = findViewById(R.id.Chicken);
        if(Beef.isChecked())
        {
            str+="Beef\n";
        }
        if(Pork.isChecked())
        {
            str+="Pork\n";
        }
        if(Chicken.isChecked())
        {
            str+="Chicken\n";
        }
        TextView textView = findViewById(R.id.textView);
        textView.setText(str);

    }*/


}