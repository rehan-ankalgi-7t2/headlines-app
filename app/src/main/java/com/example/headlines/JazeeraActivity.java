package com.example.headlines;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class JazeeraActivity extends AppCompatActivity {

    WebView wv_jazeera;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazeera);

        wv_jazeera = (WebView)findViewById(R.id.wv_jazeera);

        WebSettings websettings = wv_jazeera.getSettings();
        websettings.setJavaScriptEnabled(true);
        wv_jazeera.loadUrl("https://www.aljazeera.com/");
    }
}