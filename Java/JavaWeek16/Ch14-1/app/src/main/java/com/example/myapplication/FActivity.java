package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class FActivity extends AppCompatActivity {
    SharedPreferences perf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factivity);
        perf = getSharedPreferences("MyPref",MODE_PRIVATE);
        converTem();
    }

    private void converTem() {
        int c;

        String str = perf.getString("TEM","100");
        c = Integer.parseInt(str);
        double t= (9.0*c)/5.0+32.0;
        TextView o = findViewById(R.id.output);
        o.setText("F:"+Double.toString(t));
    }
}