package com.example.headlines;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class NycActivity extends AppCompatActivity {

    WebView wv_nyc;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nyc);

        wv_nyc = (WebView)findViewById(R.id.wv_nyc);

        WebSettings websettings = wv_nyc.getSettings();
        websettings.setJavaScriptEnabled(true);
        wv_nyc.loadUrl("https://www.nytimes.com/");
    }
}