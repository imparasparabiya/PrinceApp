package com.example.princeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;

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

            }
        });
        opensnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        wrapsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        pinweelsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        grilledsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        sddsnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}