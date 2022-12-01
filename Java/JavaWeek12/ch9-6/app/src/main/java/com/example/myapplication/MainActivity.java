package com.example.myapplication;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private  static final int SET_RESULT =1;
    private TextView output;
    Button btn;
    ActivityResultLauncher launcher = registerForActivityResult(
            new ResultContract(), new ActivityResultCallback<String>() {
        @Override
        public void onActivityResult(String result) {
            output.setText("計算結果："+result);
        }
    });
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    output=(TextView) findViewById(R.id.textView3);

    }

  /*  public void button(View view)
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
    }*/


    protected void onActivityResult(int i,int r,Intent data)
    {
        super.onActivityResult(i,r,data);
        switch (i)
        {
            case SET_RESULT:
                if(r==RESULT_OK)
                {
                    Bundle bundle = data.getExtras();
                    output.setText("計算結果"+bundle.getDouble("RESULT"));
                }
                break;
        }
    }
    class ResultContract extends ActivityResultContract<Boolean,String>{

        @NonNull
        @Override
        public Intent createIntent(@NonNull Context context, Boolean aBoolean) {
            EditText op1,op2;
            op1 = (EditText)findViewById(R.id.op1);
            op2 = (EditText) findViewById(R.id.op2);
            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            Bundle bundle = new Bundle();
            bundle.putString("OPER1",op1.getText().toString());
            bundle.putString("OPER2",op2.getText().toString());
            intent.putExtras(bundle);
            return intent;
        }

        @Override
        public String parseResult(int i, @Nullable Intent intent) {
            Bundle bundle = intent.getExtras();
            Double result = bundle.getDouble("RESULT");

            return result.toString();
        }
    }
}