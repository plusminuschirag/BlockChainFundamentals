package com.teamdecryptoutlook.blockchainfundamentals;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import java.util.Timer;
import java.util.TimerTask;

public class VideoScreen extends AppCompatActivity {
    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_screen);

        videoView = (VideoView) findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.startvideo);

        videoView.setVideoURI(uri);
        videoView.start();

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(false);
            }
        });

        TimerTask task = new TimerTask() {

            @Override
            public void run() {
                Intent intent = new Intent(VideoScreen.this, MainActivity.class);
                startActivity(intent);
            }
        };
        Timer t = new Timer();
        t.schedule(task, 4000);
    }
}

