package com.example.princeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class ColddrinkActivity extends AppCompatActivity {

        CardView softdrink,mojito,cocktail,cancolddrink,fruitsdrink,fruitjuice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colddrink);
        softdrink = findViewById(R.id.softdrink);
        mojito = findViewById(R.id.mojito);
        cocktail = findViewById(R.id.cocktail);
        cancolddrink = findViewById(R.id.cancolddrink);
        fruitjuice = findViewById(R.id.fruitsjuice);
        fruitsdrink = findViewById(R.id.fruitsdrink);

        softdrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColddrinkActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        mojito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColddrinkActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        cocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColddrinkActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        cancolddrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColddrinkActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        fruitsdrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColddrinkActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        fruitjuice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ColddrinkActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
    }
}