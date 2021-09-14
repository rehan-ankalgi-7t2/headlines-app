package com.example.headlines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_bbc, btn_buzzfeed, btn_nyc, btn_jazeera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_bbc = (Button)findViewById(R.id.btn_bbc);
        btn_nyc = (Button)findViewById(R.id.btn_nyc);
        btn_buzzfeed = (Button)findViewById(R.id.btn_buzzfeed);
        btn_jazeera = (Button)findViewById(R.id.btn_jazeera);

        btn_bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BbcActivity.class));
            }
        });

        btn_nyc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NycActivity.class));
            }
        });

        btn_buzzfeed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BuzzfeedActivity.class));
            }
        });

        btn_jazeera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, JazeeraActivity.class));
            }
        });
    }
}