package com.example.princeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

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
                Intent intent = new Intent(FastfoodActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        franchfries.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastfoodActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        frankie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastfoodActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        dosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastfoodActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        hotdog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastfoodActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        vadapav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastfoodActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
    }
}