package com.example.week7_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity
implements RadioGroup.OnCheckedChangeListener {
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image = (ImageView)findViewById(R.id.imageView);
        RadioGroup rg = (RadioGroup)findViewById(R.id.radioGroup);
        rg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case  R.id.rabbit:
                image.setImageResource(R.mipmap.rabbit);
                break;
            case  R.id.dog:
                image.setImageResource(R.mipmap.dog);
                break;
            case  R.id.elephant:
                image.setImageResource(R.mipmap.elephant);
                break;
            case  R.id.mouse:
                image.setImageResource(R.mipmap.mouse);
                break;

        }
    }
}