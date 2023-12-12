package com.example.princeapp;

import android.content.Intent;
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
                Intent intent = new Intent(PizzaActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        veggiepizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        pepperonipizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        meatpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        margheritapizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        bbqpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PizzaActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });

    }
}