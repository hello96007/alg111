package com.example.Week4_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_clean(View v)
    {
        EditText input_tall = (EditText) findViewById(R.id.tall_Input);
        EditText input_weigh = (EditText) findViewById(R.id.weigh_Input);
        TextView output = (TextView) findViewById(R.id.Total_Output);
        output.setText("答案顯示再此");
        input_tall.setText("");
        input_weigh.setText("");
    }

    public void button_Caculate(View v)
    {
        EditText input_tall = (EditText) findViewById(R.id.tall_Input);
        EditText input_weigh = (EditText) findViewById(R.id.weigh_Input);

        int tall = Integer.parseInt(input_tall.getText().toString());
        int weigh = Integer.parseInt(input_weigh.getText().toString());
        double result = (weigh)/((tall*0.01)*(tall*0.01));
        TextView output = (TextView) findViewById(R.id.Total_Output);
        //System.out.println("?????"+result);
        output.setText("答案為："+(int)result);
    }
}