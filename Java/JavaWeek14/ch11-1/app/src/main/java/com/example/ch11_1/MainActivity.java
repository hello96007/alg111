package com.example.ch11_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner sp;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = (Spinner) findViewById(R.id.spinner);
        img = (ImageView) findViewById(R.id.imageView);

    }
    public void button_Click(View view)
    {
        int index = sp.getSelectedItemPosition();
        if(index == 0 )
        {
            img.setImageResource(R.mipmap.image02);
        }
        else if(index == 1)
        {
            img.setImageResource(R.mipmap.image03);
        }
        else if(index == 2)
        {
            img.setImageResource(R.mipmap.image04);
        }
        else if(index == 3)
        {
            img.setImageResource(R.mipmap.image05);
        }
        else if(index == 4)
        {
            img.setImageResource(R.mipmap.image06);
        }
        else if(index == 5)
        {
            img.setImageResource(R.mipmap.image07);
        }

    }
}