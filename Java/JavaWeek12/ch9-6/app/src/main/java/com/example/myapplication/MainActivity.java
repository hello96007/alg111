package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  static final int SET_RESULT =1;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    output=(TextView) findViewById(R.id.textView3);
    }
    public void button(View view)
    {
        EditText op1,op2;
        op1 = (EditText)findViewById(R.id.op1);
        op2 = (EditText) findViewById(R.id.op2);
        Intent intent = new Intent(this,MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("OPER1",op1.getText().toString());
        bundle.putString("OPER2",op2.getText().toString());
        intent.putExtras(bundle);
        startActivityForResult(intent,SET_RESULT);
    }
    protected void onActivityResult(int i,int r,Intent data)
    {
        super.onActivityResult(i,r,data);
        switch (i)
        {
            case SET_RESULT:
                if(r==RESULT_OK)
                {
                    Bundle bundle = data.getExtras();
                    System.out.println("有到這裡嗎嗎嗎？");
                    output.setText("計算結果"+bundle.getDouble("RESULT"));
                }
                break;
        }
    }
}