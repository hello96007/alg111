package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = findViewById(R.id.videoView);
        int id = getResources().getIdentifier("wildlife","raw",this.getPackageName());
        final String path="android.resource://"+this.getPackageName()+"/"+id;
        videoView.setVideoURI(Uri.parse(path));
        videoView.setMediaController(new MediaController(this));
        videoView.start();
        }

}