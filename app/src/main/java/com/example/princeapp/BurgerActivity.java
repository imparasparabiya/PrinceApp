package com.example.princeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BurgerActivity extends AppCompatActivity {
    CardView paneerburger,pizzaburger,nutritiousburger,spicyburger,chawliburger,wholeburger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
        paneerburger = findViewById(R.id.paneerburger);
        pizzaburger = findViewById(R.id.pizzabuger);
        nutritiousburger = findViewById(R.id.nurtritiouburger);
        spicyburger = findViewById(R.id.spicyburger);
        chawliburger = findViewById(R.id.chawliburger);
        wholeburger = findViewById(R.id.wholeburger);

        paneerburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BurgerActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        pizzaburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        nutritiousburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        spicyburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        chawliburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        wholeburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}