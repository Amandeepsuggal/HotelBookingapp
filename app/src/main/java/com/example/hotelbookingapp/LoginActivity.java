package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {





        public class Main2Activity extends AppCompatActivity {
            Button b3, b4, b5;
           Intent i;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_login);

                b3 = findViewById(R.id.button11);
                b4 = findViewById(R.id.button3);
                b5 = findViewById(R.id.button5);



                b4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        i = new Intent(LoginActivity.this, Signupactivity.class);
                        startActivity(i);

                    }



                });
                b5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        i = new Intent(LoginActivity.this, ReviewActivity .class);
                        startActivity(i);

                    }



                });
            }
        }
    }

