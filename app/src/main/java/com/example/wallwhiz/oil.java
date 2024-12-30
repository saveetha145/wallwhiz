package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.ARVisualizationActivity;

class OilPaintingActivity extends AppCompatActivity {

    private ImageView logo, oilPaintingImage;
    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oil);


        logo = findViewById(R.id.logo);
        oilPaintingImage = findViewById(R.id.a);
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
                selectOilPainting();
            }
        });

        oilPaintingImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(OilPaintingActivity.this, "Oil Painting selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void navigateToNextActivity() {
        Intent intent = new Intent(OilPaintingActivity.this, ARVisualizationActivity.class);
        startActivity(intent);
    }

    private void selectOilPainting() {
        Toast.makeText(this, "Oil Painting selected", Toast.LENGTH_SHORT).show();
    }
}
