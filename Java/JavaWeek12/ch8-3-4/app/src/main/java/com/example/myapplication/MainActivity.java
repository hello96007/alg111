package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements DialogInterface.OnClickListener,DialogInterface.OnMultiChoiceClickListener {
    String[] items ={"Samsung","OPPO","Apple","ASUS"};
    boolean[]itemsChecked=new boolean[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        String msg = "";
        for(int index = 0;index<items.length;index++)
        {
            if(itemsChecked[index])
                msg+=items[index]+"\n";
        }
        TextView output = (TextView) findViewById(R.id.textView);
        output.setText(msg);
    }

    @Override//當按鈕按下去時跳出來的提示
    public void onClick(DialogInterface dialogInterface, int i, boolean b) {
        Toast.makeText(MainActivity.this,items[i]+(b?"勾選":"未勾選"),Toast.LENGTH_SHORT).show();
    }
    //點擊button時的Activity
    public void button_Click(View view)
    {
        AlertDialog build = new AlertDialog.Builder(this)

                .setTitle("選項")
                .setPositiveButton("確定",this)
                .setNegativeButton("取消",null)
                .setMultiChoiceItems(items,itemsChecked,this)
                .show();
    }
}