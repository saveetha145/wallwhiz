package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.layout2;

class LayoutActivity extends AppCompatActivity {

    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout); // Ensure this matches the XML file name

        // Initialize buttons
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        btnSelect = findViewById(R.id.btnselect);

        // Set click listener for Back button
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Close the current activity and return to the previous one
            }
        });

        // Set click listener for Next button
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToNextActivity(); // Navigate to the next activity
            }
        });

        // Set click listener for Select button
        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectLayout(); // Perform action for selecting a layout
            }
        });
    }

    private void navigateToNextActivity() {
        Intent intent = new Intent(LayoutActivity.this, layout2.class); // Replace 'NextActivity' with your actual next activity class
        startActivity(intent);
    }

    private void selectLayout() {
    }
}