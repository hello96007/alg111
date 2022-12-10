package com.example.ch10_3_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "ch10-3-3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(TAG,"Create");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(TAG,"Resume");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(TAG,"Stop");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(TAG,"Pause");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(TAG,"Restatr");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG,"Destory");
    }

    public void button_Click(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:25.04,121.51"));
        startActivity(i);
    }
    public void button2_click(View view)
    {
        finish();
    }
}