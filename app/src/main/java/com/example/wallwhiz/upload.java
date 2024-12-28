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

public class UploadActivity extends AppCompatActivity {

    private ImageView imgFromGallery, imgFromCamera;
    private TextView tvFromGallery, tvFromCamera;
    private Button btnback, btnNext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload); // Replace with your actual layout file name if different

        // Initialize views
        imgFromGallery = findViewById(R.id.gallery);
        imgFromCamera = findViewById(R.id.imageView5); // Assuming the IDs are correct
        tvFromGallery = findViewById(R.id.textView14);
        tvFromCamera = findViewById(R.id.camera);
        btnback= findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnback); // Update ID if incorrect

        // Set up click listeners
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
        // Logic to open the gallery
        Toast.makeText(this, "Gallery opened", Toast.LENGTH_SHORT).show();
        // Intent to open gallery can be implemented here
    }

    private void openCamera() {
        // Logic to open the camera
        Toast.makeText(this, "Camera opened", Toast.LENGTH_SHORT).show();
        // Intent to open camera can be implemented here
    }

    private void navigateBack() {
        // Navigate to the previous screen
        Toast.makeText(this, "Navigating back", Toast.LENGTH_SHORT).show();
        finish();
    }

    private void navigateNext() {
        // Navigate to the next screen
        Toast.makeText(this, "Navigating next", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, size.class); // Replace with the actual next activity
        startActivity(intent);
    }
}
