package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

abstract class deliveryActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnBack, btnNext, btnSelect;
    private TextView delivery = findViewById(R.id.admin_profile), customizeFrameText, details, phn, altphn, add, land, payment;
    private ImageView logo, gpay, scanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);

        // Initialize views
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        btnSelect = findViewById(R.id.btnselect);
        customizeFrameText = findViewById(R.id.customize_frame_text);
        details = findViewById(R.id.details);
        phn = findViewById(R.id.phn);
        altphn = findViewById(R.id.altphn);
        add = findViewById(R.id.add);
        land = findViewById(R.id.land);
        payment = findViewById(R.id.payment);
        logo = findViewById(R.id.logo);
        gpay = findViewById(R.id.gpay);
        scanner = findViewById(R.id.logo);


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(deliveryActivity.this, TruckActivity.class);
                startActivity(intent);
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}