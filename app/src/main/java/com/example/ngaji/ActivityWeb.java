package com.example.ngaji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ActivityWeb extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle("Keutamaan Sholat");


        webView = (WebView) findViewById(R.id.web1);
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://www.dicoding.com/");
        webView.loadUrl("file:///android_asset/sholat.html");
        setContentView(webView);
    }
}
