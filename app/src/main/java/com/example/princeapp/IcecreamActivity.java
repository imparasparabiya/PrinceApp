package com.example.princeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
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
                Intent intent = new Intent(IcecreamActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        kulfi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IcecreamActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        sbyicecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IcecreamActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        vanilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IcecreamActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        havmor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IcecreamActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        thickshake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IcecreamActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
    }
}