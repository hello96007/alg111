package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    private String fname="note.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnsave_Click(View view)
    {
        EditText input=(EditText) findViewById(R.id.txtinput);
        String str = input.getText().toString();
        try {
            FileOutputStream out = openFileOutput(fname,MODE_PRIVATE);
            out.write(str.getBytes());
            out.close();
            Toast.makeText(this,"成功寫入",Toast.LENGTH_SHORT).show();
            input.setText("");

        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

    public void btnRead_Click(View view)
    {
        try {
            FileInputStream in = openFileInput(fname);
            byte[] data = new byte[128];
            in.read(data);
            in.close();

            String str = new String(data);
            Toast.makeText(this,"讀取成功",Toast.LENGTH_SHORT).show();
            TextView output = (TextView) findViewById(R.id.txtmsg);
            output.setText("讀取內容：\n"+str);
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}