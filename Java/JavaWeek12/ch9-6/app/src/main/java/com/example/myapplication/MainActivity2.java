package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void button2(View view)
    {
        int op1 ,op2;
        double result = 0.0;
        RadioButton add,sub,mul,div;
        CheckBox chkdiv;
        Bundle bundle = this.getIntent().getExtras();
        if(bundle == null)return;
        op1 = Integer.parseInt(bundle.getString("OPER1"));
        op2 = Integer.parseInt(bundle.getString("OPER2"));

        add = (RadioButton) findViewById(R.id.add);
        if(add.isChecked())
        {
            result = op1+op2;
        }
        sub=(RadioButton) findViewById(R.id.sub);
        if(sub.isChecked())
        {
            result = op1-op2;
        }
        mul = (RadioButton) findViewById(R.id.mul);
            if(mul.isChecked())
            {
             result = op1*op2;
            }
        div = (RadioButton) findViewById(R.id.div);
        chkdiv = (CheckBox) findViewById(R.id.checkBox);
        if(div.isChecked())
        {
            if(chkdiv.isChecked())
            result = op1/op2;
            else
                result = op1/(double)op2;
        }
        Intent rIntent= new Intent();
        Bundle rbundle = new Bundle();
        rbundle.putDouble("RESULT",result);
        System.out.println("這裡有東西嗎"+result);
        rIntent.putExtras(rbundle);
        setResult(RESULT_OK,rIntent);
        finish();
    }
}