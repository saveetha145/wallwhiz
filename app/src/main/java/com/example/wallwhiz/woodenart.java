package com.example.wallwhiz.;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.wallwhiz.oil;

public class WoodenArtActivity extends AppCompatActivity {

    private ImageView logo, woodenArtImage;
    private AppCompatButton btnBack, btnNext, btnSelect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woodenart); // Ensure this is the correct layout file name

        // Initialize views
        logo = findViewById(R.id.logo);
        woodenArtImage = findViewById(R.id.a);
        btnBack = findViewById(R.id.btnback);
        btnNext = findViewById(R.id.btnnext);
        btnSelect = findViewById(R.id.btnselect);

        // Set click listeners for buttons
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Finish the current activity and return to the previous one
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToNextActivity(); // Navigate to the next activity
            }
        });

        btnSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectWoodenArt(); // Handle the wooden art selection
            }
        });

        // Optional: Set a click listener for the wooden art image
        woodenArtImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WoodenArtActivity.this, "Wooden Art selected", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Method to navigate to the next activity
    private void navigateToNextActivity() {
        // Replace 'NextActivity' with the actual activity class you want to navigate to
        Intent intent = new Intent(WoodenArtActivity.this, oil.class);
        startActivity(intent);
    }

    // Method to handle the selection of wooden art
    private void selectWoodenArt() {
        Toast.makeText(this, "Wooden Art selected", Toast.LENGTH_SHORT).show();
        // Add additional logic here if needed, such as saving the selection or updating the UI
    }
}
