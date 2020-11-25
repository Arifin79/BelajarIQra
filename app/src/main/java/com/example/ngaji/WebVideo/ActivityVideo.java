package com.example.ngaji.WebVideo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.ngaji.ActivityWeb;
import com.example.ngaji.ActivityWeb1;
import com.example.ngaji.R;

public class ActivityVideo extends AppCompatActivity {
    private VideoView videoView;
    private MediaController mediaController;
    private Button playVideo;
    CardView btnvideosholat1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        btnvideosholat1 = (findViewById(R.id.islamcardid));
        btnvideosholat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityWeb1.class));
            }
        });

        if (getSupportActionBar() !=null)
            getSupportActionBar().setTitle("Wudhu");


        //Inisialisasi VideoView, MediaController dan Button
        videoView = findViewById(R.id.video);
        playVideo = findViewById(R.id.play);
        mediaController = new MediaController(this);


        //Menjalankan Video saat tombol Play di Klik
        playVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.cara_wudhu);


                videoView.setVideoURI(uri);

                //Memasang MediaController untuk menampilkan tombol play, pause, dsb
                videoView.setMediaController(mediaController);
                mediaController.setAnchorView(videoView);

                //Menjalankan Video
                videoView.start();
            }
        });


    }
}