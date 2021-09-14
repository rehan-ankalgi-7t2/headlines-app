package com.example.headlines;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class BbcActivity extends AppCompatActivity {

    WebView wv_bbc;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbc);

        wv_bbc = (WebView)findViewById(R.id.wv_bbc);

        WebSettings websettings = wv_bbc.getSettings();
        websettings.setJavaScriptEnabled(true);
        wv_bbc.loadUrl("https://www.bbc.com/news/world");
    }
}