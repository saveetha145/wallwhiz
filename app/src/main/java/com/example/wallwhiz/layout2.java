package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

class Layout2Activity extends AppCompatActivity {

    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout2); // Ensure this matches the XML file name

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

    // Method to navigate to the next activity
    private void navigateToNextActivity() {
        Intent intent = new Intent(Layout2Activity.this, layout3.class); // Replace 'NextActivity' with your actual next activity class
        startActivity(intent);
    }

    // Method to handle layout selection
    private void selectLayout() {
        // Implement the action for selecting a layout
        // For example, you could store the selected layout ID or perform other operations
    }
}
