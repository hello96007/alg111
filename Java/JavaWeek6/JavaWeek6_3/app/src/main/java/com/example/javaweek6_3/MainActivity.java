package com.example.javaweek6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements RadioGroup.OnCheckedChangeListener,TextWatcher {
    private TextView textView;
    private EditText editText;
    private  RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =(TextView)findViewById(R.id.textView);
        radioGroup = findViewById(R.id.rdbgroup);
        radioGroup.setOnCheckedChangeListener(this);
        editText = findViewById(R.id.TextName);
        editText.addTextChangedListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        show(i);
    }


    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
    show(radioGroup.getCheckedRadioButtonId());
    }

    @Override
    public void afterTextChanged(Editable editable) {
     //不用寫
    }

    public void show(int i)
    {
        String str="";
        str = editText.getText().toString()+"\n";
        switch (i)
        {



            case R.id.rdbBoy:
                RadioButton boy = findViewById(R.id.rdbBoy);
                textView.setText(boy.getText()+str);
                break;

            case R.id.rdbGirl:
                RadioButton girl = findViewById(R.id.rdbGirl);
                textView.setText(girl.getText()+str);
                break;
        }

    }
}