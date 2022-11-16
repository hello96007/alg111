package com.example.ch8_1_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    private ListView lv;
    private String[] cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cities = getResources().getStringArray(R.array.cities);
        lv = findViewById(R.id.listview);
        lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
       // Toast.makeText(this,cities[i],Toast.LENGTH_LONG).show();
       // Toast.makeText(this,cities[i],Toast.LENGTH_LONG).show();
        String a="hi";
        Toast.makeText(this,cities[i],Toast.LENGTH_LONG).show();

    }
}