package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

class UploadActivity extends AppCompatActivity {

    private ImageView imgFromGallery, imgFromCamera;
    private TextView tvFromGallery, tvFromCamera;
    private Button btnback, btnNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);


        imgFromGallery = findViewById(R.id.gallery);
        imgFromCamera = findViewById(R.id.imageView5);
        tvFromGallery = findViewById(R.id.textView14);
        tvFromCamera = findViewById(R.id.camera);
        btnback= findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnback);


        imgFromGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });

        imgFromCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        });

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateBack();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateNext();
            }
        });
    }

    private void openGallery() {

        Toast.makeText(this, "Gallery opened", Toast.LENGTH_SHORT).show();

    }

    private void openCamera() {

        Toast.makeText(this, "Camera opened", Toast.LENGTH_SHORT).show();

    }

    private void navigateBack() {

        Toast.makeText(this, "Navigating back", Toast.LENGTH_SHORT).show();
        finish();
    }

    private void navigateNext() {

        Toast.makeText(this, "Navigating next", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, sizeActivity.class);
        startActivity(intent);
    }
}
