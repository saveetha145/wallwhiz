
package com.example.wallwhiz; // Replace with your app's package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class welcome extends AppCompatActivity {

    // Declare the views
    private ImageView backgroundImage, appLogo;
    private TextView tvSignup; // Removed tvAppName as it does not exist in XML
    private AppCompatButton btnGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Initialize the views
        backgroundImage = findViewById(R.id.a);
        appLogo = findViewById(R.id.logo);
        tvSignup = findViewById(R.id.desgin); // Only one TextView is present in XML with this ID
        btnGetStarted = findViewById(R.id.btnback);

        // Set click listener for the button
        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the next activity
                Intent intent = new Intent(welcome.this, login.class); // Replace 'NextActivity.class' with your target activity
                startActivity(intent);
            }
        });
    }
}