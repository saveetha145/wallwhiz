package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.OilPaintingActivity;

class WoodenArtActivity extends AppCompatActivity {

    private ImageView logo, woodenArtImage;
    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woodenart);


        logo = findViewById(R.id.logo);
        woodenArtImage = findViewById(R.id.a);
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
                selectWoodenArt();
            }
        });


        woodenArtImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WoodenArtActivity.this, "Wooden Art selected", Toast.LENGTH_SHORT).show();
            }
        });
    }


    private void navigateToNextActivity() {

        Intent intent = new Intent(WoodenArtActivity.this, OilPaintingActivity.class);
        startActivity(intent);
    }


    private void selectWoodenArt() {
        Toast.makeText(this, "Wooden Art selected", Toast.LENGTH_SHORT).show();

    }
}
