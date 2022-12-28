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
    private final int MAX = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(View view)
    {
        EditText elat = findViewById(R.id.lat);
        EditText elng = findViewById(R.id.lng);

        float lat = Float.parseFloat(elat.getText().toString());
        float lng = Float.parseFloat(elng.getText().toString());

        TextView output = findViewById(R.id.output);
        try {
            Geocoder geocoder = new Geocoder(
                    this, Locale.TAIWAN);
            List<Address>listaddress = geocoder.getFromLocation(lat,lng,MAX);
            if(listaddress!=null)
            {
                String out = "";
                for(int i =0;i<MAX;i++)
                {
                    Address ad = listaddress.get(i);
                    out+=(i+1)+":";
                    for(int j=0;j<ad.getMaxAddressLineIndex();j++)
                    {
                        out+=ad.getAddressLine(j)+" ";
                    }
                    out+=ad.getFeatureName()+"-"+ad.getPostalCode();
                    out+="\n";
                }
                output.setText(out);

            }
            else
            {
                output.setText("沒有回傳值");
            }
        } catch (IOException e) {
            System.out.println("error");
            e.printStackTrace();
        }


    }

}