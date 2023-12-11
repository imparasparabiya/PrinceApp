package com.example.princeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    ImageView imgpizza, imgburger, imgsandwich, imgfastfood, imgicecream, imgcolddrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        imgpizza = findViewById(R.id.imgpizza);
        imgburger = findViewById(R.id.imgburger);
        imgsandwich = findViewById(R.id.imgsandwich);
        imgfastfood = findViewById(R.id.imgfastfood);
        imgicecream = findViewById(R.id.imgicecream);
        imgcolddrink = findViewById(R.id.imgcolddrink);

        imgpizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,PizzaActivity.class);
            }
        });
        imgburger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,BurgerActivity.class);
            }
        });
        imgsandwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this,SandwichActivity.class);
            }
        });
        imgfastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ThirdActivity.this, FastfoodActivity.class);

            }
        });
        imgicecream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        imgcolddrink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}