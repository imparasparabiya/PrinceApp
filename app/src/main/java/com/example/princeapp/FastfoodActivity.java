package com.example.princeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

public class FastfoodActivity extends AppCompatActivity {
CardView drymanchurian,franchfries,frankie,dosa,hotdog,vadapav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fastfood);
        drymanchurian = findViewById(R.id.drymanchurian);
        franchfries = findViewById(R.id.franchfries);
        frankie = findViewById(R.id.frankie);
        dosa = findViewById(R.id.dosa);
        hotdog = findViewById(R.id.hotdog);
        vadapav = findViewById(R.id.vadapav);

        drymanchurian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        franchfries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        frankie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        dosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        hotdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        vadapav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}