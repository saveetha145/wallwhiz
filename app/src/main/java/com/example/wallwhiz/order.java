
package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

class OrderActivity extends AppCompatActivity {

    private Button btnBack, btnNext = findViewById(R.id.btnnext);
    private TextView textView15, textView5, textView6, textView3, textView16, textView2, detailsTitle, admin;
    private ImageView logo, imageView2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        btnBack = findViewById(R.id.btnback);
        textView15 = findViewById(R.id.textView15);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView3 = findViewById(R.id.textView3);
        textView16 = findViewById(R.id.textView16);
        textView2 = findViewById(R.id.textView2);
        detailsTitle = findViewById(R.id.payment);
        admin = findViewById(R.id.admin_profile);
        logo = findViewById(R.id.logo);
        imageView2 = findViewById(R.id.imageView2);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderActivity.this, deliveryActivity.class);
                startActivity(intent);
            }
        });
    }
}
