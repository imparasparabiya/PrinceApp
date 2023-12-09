package com.example.princeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

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
                String fastname = txtfastname.getEditText().toString();
                String surename = txtsurename.getEditText().toString();
                String cnt = txtcnt.getEditText().toString();
                String email = txtemail.getEditText().toString();
                String password = txtpassword.getEditText().toString();

                Intent intent = new Intent(SingupActivity.this, MainActivity.class);

                intent.putExtra("fastname", fastname);
                intent.putExtra("surename", surename);
                intent.putExtra("cnt", cnt);
                intent.putExtra("email", email);
                intent.putExtra("password", password);

                startActivity(intent);


            }
        });

    }
}