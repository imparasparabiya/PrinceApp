package com.example.princeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class IcecreamActivity extends AppCompatActivity {

    CardView chocolate,kulfi,sbyicecream,vanilla,havmor,thickshake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icecream);
        chocolate = findViewById(R.id.chocolate);
        kulfi = findViewById(R.id.kulfi);
        sbyicecream = findViewById(R.id.sbyicecream);
        vanilla = findViewById(R.id.vanilla);
        havmor = findViewById(R.id.havmor);
        thickshake = findViewById(R.id.thickshake);

        chocolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        kulfi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        sbyicecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        vanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        havmor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        thickshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}