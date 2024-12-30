package com.example.wallwhiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


class sizeActivity extends AppCompatActivity {

    private EditText sizeSelector;
    private ImageView first, two, three, four, five, six, seven, eight, nine;
    private AppCompatButton btnNext, btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_size);

        sizeSelector = findViewById(R.id.editText);
        first = findViewById(R.id.first);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five1);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        btnNext = findViewById(R.id.btnnext);
        btnBack = findViewById(R.id.btnback);

        setImageViewListeners();

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNextActivity();
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void setImageViewListeners() {
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: First");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Two");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Three");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Four");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Five");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Six");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Seven");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Eight");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateSizeSelector("Size: Nine");
            }
        });
    }

    private void updateSizeSelector(String sizeText) {
        sizeSelector.setText(sizeText);
        Toast.makeText(this, sizeText + " selected", Toast.LENGTH_SHORT).show();
    }

    private void goToNextActivity() {
        String selectedSize = sizeSelector.getText().toString().trim();
        if (selectedSize.isEmpty()) {
            Toast.makeText(this, "Please select a size before proceeding", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Navigating to the next screen...", Toast.LENGTH_SHORT).show();
            // Navigate to the next activity
            Intent intent = new Intent(sizeActivity.this, acrylicActivity.class);
            intent.putExtra("selectedSize", selectedSize);
            startActivity(intent);
        }
    }
}
