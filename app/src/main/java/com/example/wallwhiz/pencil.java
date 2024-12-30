package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

class pencilrtactivity extends AppCompatActivity {

    private ImageView logo, pencilArtImage;
    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pencil);

        logo = findViewById(R.id.logo);
        pencilArtImage = findViewById(R.id.a);
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
                navigateToNextActivity();
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectPencilArt();
            }
        });


        pencilArtImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(pencilrtactivity.this, "Pencil Art selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void navigateToNextActivity() {
        Intent intent = new Intent(pencilrtactivity.this, digitalActivity.class);
        startActivity(intent);
    }

    private void selectPencilArt() {

        Toast.makeText(this, "Pencil Art selected", Toast.LENGTH_SHORT).show();
    }
}
