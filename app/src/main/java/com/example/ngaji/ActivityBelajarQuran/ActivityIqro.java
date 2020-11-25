package com.example.ngaji.ActivityBelajarQuran;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.ngaji.Adapter.CostumListAdapter;
import com.example.ngaji.R;

import java.io.IOException;

public class ActivityIqro extends AppCompatActivity {
    ListView belajariqro;

    String[] judulList = {
            "Alif",
            "Ba",
            "Ta",
            "Tsa",
            "Jim",
            "Kha",
            "Kho",
            "Dal",
            "Dzal",
            "Ro",
            "Zay",
            "Sin",
            "Syin",
            "Shod",
            "Dhod",
            "Tho",
            "Dzo",
            "Ain",
            "Ghoin",
            "Fa",
            "Qof",
            "Kaf",
            "Lam",
            "Mim",
            "Nun",
            "Waw",
            "Hamzah",
            "Ha",
            "Ya"


    };

    Integer[] gambarHamzah = {
            R.drawable.alif,
            R.drawable.ba,
            R.drawable.ta,
            R.drawable.tsa,
            R.drawable.jim,
            R.drawable.kha,
            R.drawable.kho,
            R.drawable.dal,
            R.drawable.dzal,
            R.drawable.ro,
            R.drawable.zai,
            R.drawable.sin,
            R.drawable.syin,
            R.drawable.sod,
            R.drawable.dhod,
            R.drawable.tho,
            R.drawable.to,
            R.drawable.ain,
            R.drawable.goin,
            R.drawable.fa,
            R.drawable.qof,
            R.drawable.kaf,
            R.drawable.lam,
            R.drawable.mim,
            R.drawable.nun,
            R.drawable.waw,
            R.drawable.hamzah,
            R.drawable.ha,
            R.drawable.ya

    };

    int[] list_musik = {
            R.raw.alif,
            R.raw.ba,
            R.raw.ta,
            R.raw.tsa,
            R.raw.jim,
            R.raw.kha,
            R.raw.kho,
            R.raw.dal,
            R.raw.dzal,
            R.raw.ro,
            R.raw.zay,
            R.raw.sin,
            R.raw.syin,
            R.raw.shod,
            R.raw.dhod,
            R.raw.to,
            R.raw.dza,
            R.raw.ain,
            R.raw.ghain,
            R.raw.fa,
            R.raw.kaf,
            R.raw.kaf,
            R.raw.lam,
            R.raw.mim,
            R.raw.nun,
            R.raw.wa,
            R.raw.hamzah,
            R.raw.ha,
            R.raw.ya,

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityiqro);
        belajariqro = findViewById(R.id.belajariqro);

        CostumListAdapter adapter = new CostumListAdapter(this, judulList, gambarHamzah);
        belajariqro.setAdapter(adapter);

        if (getSupportActionBar() !=null)
            getSupportActionBar().setTitle("Huruf Hijaiyah");

        belajariqro.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "anda memilih :" + judulList[position],
                        Toast.LENGTH_SHORT).show();

                Uri myUri = Uri.parse("android.resource://" + getPackageName() + "/" + list_musik[position]);
                MediaPlayer mediaPlayer = new MediaPlayer();
                mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                try {
                    mediaPlayer.setDataSource(getApplicationContext(), myUri);
                }catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    mediaPlayer.prepare();
                }catch (IOException e) {
                    e.printStackTrace();
                }
                mediaPlayer.start();
            }
        });

    }
}
