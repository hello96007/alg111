package com.example.ch7_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Spinner sp1,sp2;
    private String[] desserts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String[] course = {"美式漢堡","特選牛排","咖喱飯","豬排飯"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1 = (Spinner) findViewById(R.id.spinner2);
        ArrayAdapter<String> a1 = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,course);
        sp1.setAdapter(a1);
        desserts = getResources().getStringArray(R.array.dessert);
        sp2 = (Spinner) findViewById(R.id.spinner3);
        ArrayAdapter<String> a2 = new ArrayAdapter<>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,desserts);
        sp2.setAdapter(a2);
    }

    public void button_Click(View view){
        String main = sp1.getSelectedItem().toString();
        String dessert = sp2.getSelectedItem().toString();
        TextView output = (TextView) findViewById(R.id.textoutput);
        output.setText("主食："+main+"\n甜點"+dessert);

    }
}