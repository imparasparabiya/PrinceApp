package com.example.princeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class SingupActivity extends AppCompatActivity {

    TextInputLayout txtfastname, txtsurename,txtcnt,txtemail,txtpassword;
    Button singup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup);
        txtfastname = findViewById(R.id.txtfastname);
        txtsurename = findViewById(R.id.txtsurename);
        txtcnt = findViewById(R.id.txtcnt);
        txtemail = findViewById(R.id.txtemail);
        txtpassword = findViewById(R.id.txtpassword);
        singup = findViewById(R.id.singup);

        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}