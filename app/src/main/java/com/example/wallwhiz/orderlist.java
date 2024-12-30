package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

class OrderListActivity extends AppCompatActivity {

    private Button btnBack, btnNext;
    private TextView adminProfile, textView7, textView8;
    private ImageView logo, imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orderlist);

        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        adminProfile = findViewById(R.id.admin_profile);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        logo = findViewById(R.id.logo);
        imageView4 = findViewById(R.id.imageView4);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OrderListActivity.this, UpdateActivity.class);
                startActivity(intent);
            }
        });
    }
}