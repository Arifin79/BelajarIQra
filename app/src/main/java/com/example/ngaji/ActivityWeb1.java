package com.example.ngaji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ActivityWeb1 extends AppCompatActivity {
    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);

        if (getSupportActionBar() != null)
            getSupportActionBar().setTitle("Keutamaan Wudhu");


        webView1 = (WebView) findViewById(R.id.web2);
        webView1 = new WebView(this);
        webView1.getSettings().setJavaScriptEnabled(true);
//        webView.loadUrl("https://www.dicoding.com/");
        webView1.loadUrl("file:///android_asset/wudhu.html");
        setContentView(webView1);
    }
}
