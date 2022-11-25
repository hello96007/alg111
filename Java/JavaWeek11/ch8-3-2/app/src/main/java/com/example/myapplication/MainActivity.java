package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void button_Click(View view)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("確認")
                .setMessage("確定結束")
                .setPositiveButton("確定",  this)
                .setNegativeButton("取消", this)
                .show();
    }
    @Override
    public void onClick(DialogInterface dialogInterface,int whitch)
    {
        switch (whitch)
        {
            case DialogInterface.BUTTON_POSITIVE:
                finish();break;
            case DialogInterface.BUTTON_NEGATIVE:
                Toast.makeText(this,"按下取消鈕",Toast.LENGTH_SHORT).show();break;
        }
    }



}