package com.example.hotelbookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

        public class Signupactivity extends AppCompatActivity {

            Button b1,b2;
            ConstraintLayout l1;

            public static final String MyPREFERENCES="Aman";
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                b2=findViewById(R.id.button);
                b2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i1=new Intent(Signupactivity.this,LoginActivity.class);
                        startActivity(i1);
                    }
                });
            }
        }

