package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

class reviewActivity extends AppCompatActivity {

    private Button submitButton;
    private EditText comments;
    private ImageView star1, star2, star3, star4, star5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        // Initialize views
        submitButton = findViewById(R.id.submitButton);
        comments = findViewById(R.id.comments);
        star1 = findViewById(R.id.five1); // Note: There are multiple ImageViews with the same id, this will only find the first one
        star2 = findViewById(R.id.four); // Note: There are multiple ImageViews with the same id, this will only find the first one

        // Set click listeners for buttons
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get comments from edit text
                String comment = comments.getText().toString();

                // Validate comments
                if (comment.isEmpty()) {
                    Toast.makeText(reviewActivity.this, "Please enter your comments", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Submit review (API call or database operation)
                // For demonstration purposes, just display a toast message
                Toast.makeText(reviewActivity.this, "Review submitted successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}