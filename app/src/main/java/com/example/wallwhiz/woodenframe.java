package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

class woodenframeActivity extends AppCompatActivity {

    private ImageView logo, imageA;
    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woodenframe);

        logo = findViewById(R.id.logo);
        imageA = findViewById(R.id.a);
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        btnSelect = findViewById(R.id.btnselect);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextActivity();
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectFrame();
            }
        });

        imageA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(woodenframeActivity.this, "Wooden Frame selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void goToNextActivity() {
        Toast.makeText(this, "Navigating to the next screen...", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(woodenframeActivity.this, pencilrtactivity.class);
        startActivity(intent);
    }

    private void selectFrame() {
        Toast.makeText(this, "Frame selected", Toast.LENGTH_SHORT).show();
    }
}
