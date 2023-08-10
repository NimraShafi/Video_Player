package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.vView2);
        /*For Online
        String onlinePath ="https://www.vplayed.com/blog/wp-content/uploads/2023/07/video-streaming-servers-2.mp4";
        Uri uri = Uri.parse(onlinePath);
        videoView .setVideoURI(uri);
        videoView .start();*/


       /* For Local*/
        videoView.setVideoPath(("android.resource://"+getPackageName()+"/"+R.raw.vedio));

       /*For online and local*/
        MediaController mc2=new MediaController(this);
        mc2.setAnchorView(videoView);
        videoView .setMediaController(mc2);
        mc2.setAnchorView(videoView);
    }
}