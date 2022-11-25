package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factivity);
        convertTem();
    }

    private void convertTem() {
        int c;
        double f = 0.0;
        Bundle bundle = this.getIntent().getExtras();
        if(bundle!=null)
        {
            c = Integer.parseInt(bundle.getString("TEMPC"));
            f = (9.0*c)/5.0+32.0;
            TextView o  = (TextView) findViewById(R.id.textView);
            o.setText("華氏溫度："+Double.toString(f));
        }
    }
}