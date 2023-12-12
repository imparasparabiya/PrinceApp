package com.example.princeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.material.textfield.TextInputEditText;

public class PlaceActivity extends AppCompatActivity {
    TextInputEditText txtname,txtemail,txtcnt,txtadd;
    Button btnconfirmorder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place);
        txtname = findViewById(R.id.txtname);
        txtemail = findViewById(R.id.txtemail);
        txtcnt = findViewById(R.id.txtcnt);
        txtadd = findViewById(R.id.txtadd);
        btnconfirmorder = findViewById(R.id.btnconfirmorder);


    }
}