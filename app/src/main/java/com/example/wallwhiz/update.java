package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    private Button btnSubmit;
    private TextView adminProfile, textView10, textView11, textView9;
    private ImageView logo;
    private FrameLayout rectangles1, rectangles2, rectangles3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        // Initialize views
        btnSubmit = findViewById(R.id.btn_submit);
        adminProfile = findViewById(R.id.admin_profile);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);
        textView9 = findViewById(R.id.textView9);
        logo = findViewById(R.id.logo);
        rectangles1 = findViewById(R.id.rectangles); // Note: You have multiple FrameLayouts with the same id, you should change the ids to be unique.
        rectangles2 = findViewById(R.id.rectangles);
        rectangles3 = findViewById(R.id.rectangles);

        // Set click listener for submit button
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle submit button click
            }
        });
    }
}