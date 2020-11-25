package com.example.ngaji.ActivityBelajarQuran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.ngaji.R;

public class ActivityWebQuran extends AppCompatActivity {
    WebView webView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_quran);

        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle("Al - Quran");

        webView = (WebView) findViewById(R.id.web);
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://kalam.sindonews.com/quran");
        webView.loadUrl("file:///android_asset/quran.html");
        setContentView(webView);

    }
}
