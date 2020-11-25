package com.example.ngaji.CardView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.ngaji.Adapter.CostumListAdapterTata;
import com.example.ngaji.R;

public class ActivitySholat extends AppCompatActivity {
    ListView listSholat;

    String[] judulsholat = {
            "1. Gerakan Berdiri Tegak untuk Salat,",
            "2. Gerakan Mengangkat Kedua Tangan ",
            "3. Gerakan Sedekap dalam Salat",
            "4. Gerakan Rukuk Dalam Sholat",
            "5. Gerakan Iktidal dalam Sholat",
            "6. Gerakan Sujud dalam Sholat",
            "7. Gerakan Duduk antara Dua Sujud",
            "8. Gerakan Tasyahud (Tahiyat) Awal",
            "9. Gerakan Tasyahud Akhir",
            "10. Gerakan salam "
    };

    String[] detailsholat = {
            "1. Posisi badan harus tegak lurus dan tidak membungkuk, kecuali jika sakit.\n" +
                    "2. Tangan rapat di samping badan.\n" +
                    "3. Kaki direnggangkan, paling lebar selebar bahu.\n" +
                    "4. Semua ujung jari kaki menghadap kiblat.\n" +
                    "5. Pandangan lurus ke tempat sujud.\n" +
                    "6. Posisi badan menghadap kiblat. Akan tetapi, jika tidak mengetahui arah kiblat, boleh menghadap ke arah mana saja. Asal dalam hati tetap berniat menghadap kiblat.",
            "1. Telapak tangan sejajar dengan bahu.\n" +
                    "2. Ujung jari-jari sejajar dengan puncak telinga.\n" +
                    "3. Ujung ibu jari sejajar dengan ujung bawah telinga.\n" +
                    "4. Jari-jari direnggangkan.\n" +
                    "5. Telapak tangan menghadap ke arah kiblat, bukan menghadap ke atas atau ke samping.",
            "Ketika bersedekap, doa yang pertama dibaca adalah doa iftitah. Setelah selesai iftitah, kemudian membaca surat Al Fatihah. Sesudah membaca surat Al Fatihah, kemudian membaca surat pendek seperti Al Ikhlas, Al ‘Asr, dan An Nasr.",
            "1. Angkat tangan sambil mengucapkan takbir. Caranya sama seperti takbiratulihram.\n" +
                    "2. Turunkan badan ke posisi membungkuk.\n" +
                    "3. Kedua tangan menggenggam lutut. Bukan menggenggam betis atau paha. Jari-jari tangan direnggangkan. Posisi tangan lurus, siku tidak ditekuk.\n" +
                    "4. Punggung dan kepala sejajar. Punggung dan kepala dalam posisi mendatar. Tidak terlalu condong ke bawah. Tidak pula mendongah ke atas.\n" +
                    "5. Kaki tegak lurus, lutut tidak ditekuk.\n" +
                    "6. Pinggang direnggangkan dari paha.\n" +
                    "7. Pandangan lurus ke tempat sujud.\n" +
                    "Sesudah posisi ini mantap, kemudian membaca salah satu doa rukuk.",
            "iktidal adalah bangkit dari rukuk. Posisi badan kembali tegak. Ketika bangkit disunahkan mengangkat tangan seperti ketika takbiratulihram. Bersamaan dengan itu membaca kalimat “sami’allahu liman hamidah”. Badan kembali tegak berdiri. Tangan rapat di samping badan. Ada juga yang kembali ke posisi bersedekap seperti halnya ketika membaca surat Al Fatihah.",
            "1. Turunkan badan dari posisi iktidal, dimulai dengan menekuk lutut sambil mengucapkan takbir.\n" +
                    "2. Letakkan kedua lutut ke lantai.\n" +
                    "3. Letakkan kedua telapak tangan ke lantai.\n" +
                    "4. Letakkan kening dan hidung ke lantai.\n" +
                    "5. Talapak tangan dibuka, tidak dikepalkan. Akan tetapi, jari-jarinya dirapatkan, dan ini satu-satunya gerakan di mana jari-jari tangan dirapatkan, sementara dalam gerakan lainnya jari-jari ini selalu direnggangkan.",
            "1. Bangkit dari sujud pertama sambil mengucapkan takbir.\n" +
                    "2. Telapak kaki kiri dibuka dan diduduki.\n" +
                    "3. Telapak kaki kanan tegak. Jari-jarinya menghadap ke arah kiblat.\n" +
                    "4. Badan tegak lurus.\n" +
                    "5. Siku ditekuk. Tangan sejajar dengan paha.\n" +
                    "6. Telapak tangan dibuka. Jari-jarinya direnggangkan dan menghadap ke arah kiblat.\n" +
                    "7. Telapak tangan diletakkan di atas paha. Ujung jari tangan sejajar dengan lutut.\n" +
                    "8. Pandangan lurus ke tempat sujud.\n" +
                    "9. Setelah posisi tumakninah, baru kemudian membaca salah satu doa antara dua sujud.",
            "1. Bangkit dari sujud kedua rakaat kedua sambil membaca takbir.\n" +
                    "2. Telapak kaki kiri dibuka dan diduduki.\n" +
                    "3. Telapak kaki kanan tegak. Jari-jarinya menghadap ke arah kiblat.\n" +
                    "4. Badan tegak lurus.\n" +
                    "5. Siku ditekuk. Tangan sejajar dengan paha.\n" +
                    "6. Telapak tangan dibuka. Jari-jarinya direnggangkan dan menghadap ke arah kiblat.\n" +
                    "7. Telapak tangan diletakkan di atas paha. Ujung jari tangan sejajar dengan lutut.\n" +
                    "8. Disunahkan memberi isyarat dengan telunjuk, yaitu telapak tangan kanan digenggamkan. Kemudian telunjuk diangkat (menunjuk). Dalam posisi ini kemudian membaca doa tasyahud.",
            "1. Bangkit dari sujud kedua, yaitu pada rakaat terakhir salat, sambil membaca takbir.\n" +
                    "2. Telapak kaki kiri dimasukkan ke bawah kaki kanan. Jadi, panggul duduk menyentuh lantai.\n" +
                    "3. Telapak kaki kanan tegak. Jari-jarinya menghadap ke arah kiblat.\n" +
                    "4. Badan tegak lurus.\n" +
                    "5. Siku ditekuk. Tangan sejajar dengan paha.\n" +
                    "6. Telapak tangan dibuka. Jari-jarinya direnggangkan dan menghadap ke arah kiblat.\n" +
                    "7. Telapak tangan diletakkan di atas paha. Ujung jari tangan sejajar dengan lutut.\n" +
                    "8. Disunahkan memberi isyarat dengan telunjuk, yaitu telapak tangan kanan digenggamkan. Kemudian telunjuk diangkat (menunjuk). Dalam posisi ini kemudian membaca doa tasyahud, selawat, dan doa setelah tasyahud akhir.",
            "Gerakan salam adalah menengok ke arah kanan dan kiri. Menengok dilakukan sampai kira-kira searah dengan bahu. Jika jadi imam dalam salat berjamaah, salam dilakukan sampai terlihat hidung oleh makmum. Menengok dilakukan sambil membaca salam."
    };

    Integer[] gambarsholat = {
            R.drawable.sholat1,
            R.drawable.sholat2,
            R.drawable.sholat3,
            R.drawable.sholat4,
            R.drawable.sholat5,
            R.drawable.sholat6,
            R.drawable.sholat7,
            R.drawable.sholat7,
            R.drawable.sholat9,
            R.drawable.sholat10
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat);
        listSholat = findViewById(R.id.sholat);

        if (getSupportActionBar() !=null)
            getSupportActionBar().setTitle("Sholat");

        CostumListAdapterTata adapter = new CostumListAdapterTata(this, judulsholat,detailsholat,gambarsholat);
        listSholat.setAdapter(adapter);
    }
}