package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements MediaPlayer.OnCompletionListener {
private TextView output;
private MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output = (TextView) findViewById(R.id.textView);
        player = MediaPlayer.create(this,R.raw.abc);
        player.setOnCompletionListener(this);
        try {
            player.prepareAsync();
        }catch (Exception e)
        {
            Log.d("CH11_2","oncreate:"+e.getMessage());
        }

    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
    output.setText("音樂播放完畢");
    player.seekTo(0);
    }

    public void button_Click(View view)
    {
        if(player!=null)
        {
            if(player.isPlaying()==false)
            {
                output.setText("播放中");
                player.start();
            }
        }
    }

    public void button2_Click(View view)
    {
        output.setText("音樂暫停中");
        if(player!=null)
        {
            player.pause();
        }
    }
    public void button3_Click(View view)
    {
        output.setText("音樂停止");
        if(player!=null)
        {
            player.stop();
            player.prepareAsync();
        }
    }

    @Override
    public void onDestroy()
    {
        if(player!=null)
        {
            player.release();;
        }
        super.onDestroy();
    }
}