package com.example.ngaji.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.ngaji.ActivityBelajarQuran.ActivityIqro;
import com.example.ngaji.ActivityBelajarQuran.ActivityWebQuran;
import com.example.ngaji.R;

public class NgajiActivity extends AppCompatActivity {
    CardView btniqro;
    CardView btnquran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngaji);

        btniqro = (findViewById(R.id.iqrocardid));
        btniqro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityIqro.class));
            }
        });

        btnquran = (findViewById(R.id.qurancardid));
        btnquran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityWebQuran.class));
            }
        });
    }
}
