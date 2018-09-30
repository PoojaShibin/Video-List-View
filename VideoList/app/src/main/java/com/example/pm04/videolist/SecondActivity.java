package com.example.pm04.videolist;

import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;

public class SecondActivity extends MainActivity {
    MediaController media;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        VideoView myVideoView2=(VideoView)findViewById(R.id.videoView1);
        String fullScreen =  getIntent().getStringExtra("fullScreenInd");
        if("y".equals(fullScreen)){
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            getSupportActionBar().hide();
        }

        media = new FullScreenMediaController(this);
        media.setAnchorView(myVideoView2);

        myVideoView2.setMediaController(media);
        myVideoView2.start();
        //t1=(TextView)findViewById(R.id.txtitem);
        String Tempholder=getIntent().getStringExtra("Listviewclickvalues");
        if(Tempholder.equals("Video1"))
        {
            media=new MediaController(this);
            String urlPath2="android.resource://com.example.pm04.videolist/"+R.raw.ab;
            Uri uri2=Uri.parse(urlPath2);
            myVideoView2.setVideoURI(uri2);
            myVideoView2.setMediaController(media);
            media.setAnchorView(myVideoView2);
        }
        else  if(Tempholder.equals("Video2"))
        {
            media=new MediaController(this);
            String urlPath2="android.resource://com.example.pm04.videolist/"+R.raw.e5;
            Uri uri2=Uri.parse(urlPath2);
            myVideoView2.setVideoURI(uri2);
            myVideoView2.setMediaController(media);
            media.setAnchorView(myVideoView2);
        }
        else  if(Tempholder.equals("Video3"))
        {
            media=new MediaController(this);
            String urlPath2="android.resource://com.example.pm04.videolist/"+R.raw.e6;
            Uri uri2=Uri.parse(urlPath2);
            myVideoView2.setVideoURI(uri2);
            myVideoView2.setMediaController(media);
            media.setAnchorView(myVideoView2);
        }
        else  if(Tempholder.equals("Video4"))
        {
            media=new MediaController(this);
            String urlPath2="android.resource://com.example.pm04.videolist/"+R.raw.e5;
            Uri uri2=Uri.parse(urlPath2);
            myVideoView2.setVideoURI(uri2);
            myVideoView2.setMediaController(media);
            media.setAnchorView(myVideoView2);
        }
        else  if(Tempholder.equals("Video5"))
        {
            media=new MediaController(this);
            String urlPath2="android.resource://com.example.pm04.videolist/"+R.raw.e6;
            Uri uri2=Uri.parse(urlPath2);
            myVideoView2.setVideoURI(uri2);
            myVideoView2.setMediaController(media);
            media.setAnchorView(myVideoView2);
        }
        else  if(Tempholder.equals("Video6"))
        {
            media=new MediaController(this);
            String urlPath2="android.resource://com.example.pm04.videolist/"+R.raw.ab;
            Uri uri2=Uri.parse(urlPath2);
            myVideoView2.setVideoURI(uri2);
            myVideoView2.setMediaController(media);
            media.setAnchorView(myVideoView2);
        }
        else  if(Tempholder.equals("Video7"))
        {
            media=new MediaController(this);
            String urlPath2="android.resource://com.example.pm04.videolist/"+R.raw.e6;
            Uri uri2=Uri.parse(urlPath2);
            myVideoView2.setVideoURI(uri2);
            myVideoView2.setMediaController(media);
            media.setAnchorView(myVideoView2);
        }
        else  if(Tempholder.equals("Video8"))
        {
            media=new MediaController(this);
            String urlPath2="rtsp://r6---sn-a5mekn7k.googlevideo.com/Cj0LENy73wIaNAltcAyvi-QbchMYDSANFC3mAK9bMOCoAUIASARgwK_dyZfvhNVbigELalpQRkRGbjJYMHcM/29934894B08EDC382B7CD25C7E590656AD72EFB5.28EE995E577DFBF330A5C41A5BA9D7B171274FEB/yt6/1/video.3gp";
            Uri uri2=Uri.parse(urlPath2);
            myVideoView2.setVideoURI(uri2);
            myVideoView2.setMediaController(media);
            media.setAnchorView(myVideoView2);
            myVideoView2.requestFocus();
            myVideoView2.start();
        }
        else
            {
            t1.setText("Sorry");
        }
    }


}
