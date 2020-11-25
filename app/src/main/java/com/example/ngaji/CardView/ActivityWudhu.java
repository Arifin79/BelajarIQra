package com.example.ngaji.CardView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.ngaji.Adapter.CostumListAdapterTata;
import com.example.ngaji.R;

public class ActivityWudhu extends AppCompatActivity {

    ListView listWudhu;

    String[] judulwudhu = {
            "1. Mencuci kedua telapak tangan sebanyak tiga kali",
            "2. Berkumur",
            "3. Membasuh hidung",
            "4. Membasuh Muka",
            "5. Membasuh kedua tangan",
            "6. Membasuh kepala mulai dari ubun-ubun",
            "7. Membasuh keduan telinga",
            "8. Mencuci kedua kaki"
    };

    String[] detailwudhu = {
            "Dengan gerakan menyeka pada sela-sela jari telapak tangan yang dimulai dari tangan kanan kemudian tangan kiri kemudian diiringi dengan membaca doa.",
            "Berkumur sebanyak 3 kali, dengan gerakan utuh membersihkan mulut (bahkan dari sisa-sisa makanan yang masih ada pada mulut).",
            "Membasuh lubang hidung secara menyeluruh, sebanyak 3 kali gerakan.",
            "Membasuh seluruh permukaan wajah dengan rata, sebanyak 3 kali gerakan memutar sekeliling wajah.",
            "Membasuh kedua tangan hingga mencapai siku, sebanyak 3 kali gerakan memutar dan menyeluruh ke permukaan tangan.",
            "Membasuh kening hingga ujung kening (ubun-ubun) sampai sebagian kepala, sebanyak 3 kali gerakan menyeluruh.",
            "Membasuh kedua tengila baik itu bagian dalam maupun luar telinga (daun telinga) hingga menyeluruh ke bagian telinga, sebanyak 3 kali gerakan.",
            "Membasuh kedua kaki dan diusahakan menyeluruh tidak pada bagian depan saja, basuh hingga ke seluruh kaki hingga ke mata kaki."

    };

    Integer[] gambarwudhu = {
            R.drawable.wudhu1,
            R.drawable.wudhu2,
            R.drawable.wudhu3,
            R.drawable.wudhu4,
            R.drawable.wudhu5,
            R.drawable.wudhu6,
            R.drawable.wudhu7,
            R.drawable.wudhu8

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wudhu);
        listWudhu = findViewById(R.id.wudhu);

        if (getSupportActionBar() !=null)
            getSupportActionBar().setTitle("Wudhu");

        CostumListAdapterTata adapter = new CostumListAdapterTata(this, judulwudhu,detailwudhu,gambarwudhu);
        listWudhu.setAdapter(adapter);
    }
}
