package com.example.princeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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

        btnconfirmorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PlaceActivity.this, "Oder Karel Item Home par jate Banavi ne Khava ni Rahshe", Toast.LENGTH_LONG).show();
            }
        });

    }
}