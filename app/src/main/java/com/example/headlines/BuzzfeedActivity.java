package com.example.headlines;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class BuzzfeedActivity extends AppCompatActivity {

    WebView wv_buzz;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buzzfeed);

        wv_buzz = (WebView)findViewById(R.id.wv_buzz);

        WebSettings websettings = wv_buzz.getSettings();
        websettings.setJavaScriptEnabled(true);
        wv_buzz.loadUrl("https://www.buzzfeednews.com/section/world");
    }
}