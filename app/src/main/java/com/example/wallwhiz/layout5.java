package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

class Layout5Activity extends AppCompatActivity {

    private AppCompatButton btnBack, btnSelect, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout5); // Ensure this matches your XML file name

        // Initialize buttons
        btnBack = findViewById(R.id.btnback);
        btnSelect = findViewById(R.id.btnselect);
        btnNext = findViewById(R.id.btnnext);

        // Set click listener for Back button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the current activity
            }
        });

        // Set click listener for Select button
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectLayout(); // Handle layout selection
            }
        });

        // Set click listener for Next button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToNextActivity(); // Navigate to the next activity
            }
        });
    }

    // Method to handle layout selection
    private void selectLayout() {
        // Add your layout selection logic here
    }

    // Method to navigate to the next activity
    private void navigateToNextActivity() {
        Intent intent = new Intent(Layout5Activity.this, layout6.class); // Replace 'NextActivity' with your target activity
        startActivity(intent);
    }
}