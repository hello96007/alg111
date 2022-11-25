package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button(View view)
    {
        EditText txtc = (EditText) findViewById(R.id.txt);
        Intent intent =new Intent(this,FActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("TEMPC",txtc.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
}