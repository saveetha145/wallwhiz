
package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


class welcome extends AppCompatActivity {

    private ImageView backgroundImage, appLogo;
    private TextView tvSignup;
    private AppCompatButton btnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        backgroundImage = findViewById(R.id.a);
        appLogo = findViewById(R.id.logo);
        tvSignup = findViewById(R.id.desgin);
        btnGetStarted = findViewById(R.id.btnback);


        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(welcome.this, login.class);
                startActivity(intent);
            }
        });
    }
}