package com.example.ch10_2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Button_click(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:25,121"));
    startActivity(i);
    }

    public void Button_click2(View view)
    {
        Intent i = new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+12345678"));
        startActivity(i);
    }

    public void Button_click3(View view)
    {
        Intent i = new Intent();
        i.setAction(Intent.ACTION_SENDTO);
        i.setData(Uri.parse("mailto:s110814315@student.nqu.edu.tw"));
        startActivity(i);
    }
}