package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_click(View view)
    {
        EditText address = findViewById(R.id.txtaddress);
        String addressname = address.getText().toString();
        TextView output = findViewById(R.id.output);
        try {
            Geocoder geocoder = new Geocoder(this, Locale.TAIWAN);
            List<Address>listGps = geocoder.getFromLocationName(addressname,1);

            if(listGps!=null)
            {
                double lat = listGps.get(0).getLatitude();
                double lng = listGps.get(0).getLongitude();
                output.setText("緯度:"+lat+"\n經度"+lng);
            }
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}