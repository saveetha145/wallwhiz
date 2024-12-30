package com.example.wallwhiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

class editActivity extends AppCompatActivity {

    private Button changeProfileButton, submitButton, button2, button4;
    private TextView edit;
    private ImageView logo, profileImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        changeProfileButton = findViewById(R.id.changeProfileButton);
        submitButton = findViewById(R.id.submitButton);
        button2 = findViewById(R.id.button2);
        button4 = findViewById(R.id.button4);
        edit = findViewById(R.id.desgin);
        logo = findViewById(R.id.logo);
        profileImage = findViewById(R.id.profileImage);

        changeProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(editActivity.this, "Profile updated successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}