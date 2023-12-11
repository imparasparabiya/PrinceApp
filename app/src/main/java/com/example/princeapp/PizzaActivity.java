package com.example.princeapp;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PizzaActivity extends AppCompatActivity {
    CardView cheesepizza, veggiepizza, pepperonipizza, meatpizza, margheritapizza, bbqpizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
        cheesepizza = findViewById(R.id.cheesepizza);
        veggiepizza = findViewById(R.id.veggiepizza);
        pepperonipizza = findViewById(R.id.pepperonipizza);
        meatpizza = findViewById(R.id.meatpizza);
        margheritapizza = findViewById(R.id.margheritapizza);
        bbqpizza = findViewById(R.id.bbqpizza);

        cheesepizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        veggiepizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        pepperonipizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        meatpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        margheritapizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        bbqpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}