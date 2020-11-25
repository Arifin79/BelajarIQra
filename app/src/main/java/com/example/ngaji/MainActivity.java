package com.example.ngaji;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ngaji.Button.NgajiActivity;
import com.example.ngaji.CardView.ActivitySholat;
import com.example.ngaji.CardView.ActivityWudhu;
import com.example.ngaji.WebVideo.ActivityVideo;
import com.example.ngaji.WebVideo.ActivityVideo1;

public class MainActivity extends AppCompatActivity {
    //Tambahin list surat. jika di klik(view.getContext(), surat.class

    CardView btnsholat;
    CardView btnwudhu;
    Button btnngaji;
    CardView web;
    CardView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsholat = (findViewById(R.id.sholatcardid));
        btnsholat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivitySholat.class));
            }
        });

        btnwudhu = (findViewById(R.id.wudhucardid));
        btnwudhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityWudhu.class));
            }
        });


        btnngaji = (findViewById(R.id.button));
        btnngaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), NgajiActivity.class));
            }
        });

        web = (findViewById(R.id.webvideo));
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityVideo.class));
            }
        });

        web1 = (findViewById(R.id.webvideo1));
        web1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityVideo1.class));
            }
        });


    }
}
