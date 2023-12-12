package com.example.princeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class SandwichActivity extends AppCompatActivity {

    CardView regularsnd,opensnd,wrapsnd,pinweelsnd,grilledsnd,sddsnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandwich);

        regularsnd = findViewById(R.id.regularsnd);
        opensnd = findViewById(R.id.opensnd);
        wrapsnd = findViewById(R.id.wrapsnd);
        pinweelsnd = findViewById(R.id.pinweelsnd);
        grilledsnd = findViewById(R.id.grilledsnd);
        sddsnd = findViewById(R.id.sddsnd);

        regularsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SandwichActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        opensnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SandwichActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        wrapsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SandwichActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        pinweelsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SandwichActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        grilledsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SandwichActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
        sddsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SandwichActivity.this, PlaceActivity.class);
                startActivity(intent);
            }
        });
    }
}