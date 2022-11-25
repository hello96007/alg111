package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity
implements DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {
private TextView output;
private Calendar dt = Calendar.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = findViewById(R.id.textView);
    }

    @Override
    public void onDateSet(DatePicker datePicker, int y, int m, int d) {
        output.setText("日期："+y+"/"+(m+1)+"/"+d);

    }

    @Override
    public void onTimeSet(TimePicker timePicker, int h, int m) {
    output.setText("時間"+h+":"+m);
    }

    public void button_click(View view)
    {
        DatePickerDialog dialog = new DatePickerDialog(this,this,
                dt.get(Calendar.YEAR),dt.get(Calendar.MONTH),dt.get(Calendar.DAY_OF_MONTH));
        dialog.show();

    }

    public  void button2_click(View view)
    {
        TimePickerDialog dialog = new TimePickerDialog(this,this,dt.get(Calendar.HOUR),dt.get(Calendar.MINUTE),true);
        dialog.show();
    }
}