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
import com.example.ngaji.R;

public class ActivityVideo1 extends AppCompatActivity {
    private VideoView videoView1;
    private MediaController mediaController1;
    private Button playVideo1;
    CardView btnvideosholat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video1);

        btnvideosholat = (findViewById(R.id.qurancardid));
        btnvideosholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityWeb.class));
            }
        });

        if (getSupportActionBar() !=null)
            getSupportActionBar().setTitle("Sholat");


//        Inisialisasi VideoView, MediaController dan Button
        videoView1 = findViewById(R.id.video1);
        playVideo1 = findViewById(R.id.play1);
        mediaController1 = new MediaController(this);


        //Menjalankan Video saat tombol Play di Klik
        playVideo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.cara_sholat);

                videoView1.setVideoURI(uri);

                //Memasang MediaController untuk menampilkan tombol play, pause, dsb
                videoView1.setMediaController(mediaController1);
                mediaController1.setAnchorView(videoView1);

                //Menjalankan Video
                videoView1.start();
            }
        });
    }
}