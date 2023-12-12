package com.example.princeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

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

            }
        });
        mojito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        cocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        cancolddrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        fruitsdrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        fruitjuice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}