package com.example.wallwhiz;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class forget extends AppCompatActivity {

    private EditText emailEditText;
    private AppCompatButton btn_ResetPassword;
    private AppCompatButton btnCancel;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);

        emailEditText = findViewById(R.id.btn_email);
        btn_ResetPassword = findViewById(R.id.btnResetPass);
        btnCancel= findViewById(R.id.btn_cancel);


        btn_ResetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();

                if (email.isEmpty()) {
                    emailEditText.setError("Please enter your email");
                    emailEditText.requestFocus();
                    return;
                }


                resetPassword(email);
            }
        });


        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();
            }
        });
    }

    private void resetPassword(String email) {
        // Implement your password reset logic here
        // For example, using Firebase Authentication:
        /*
        FirebaseAuth auth = FirebaseAuth.getInstance();
        auth.sendPasswordResetEmail(email)
            .addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(ForgotPasswordActivity.this, "Password reset email sent", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(ForgotPasswordActivity.this, "Error: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
            });
        */
    }
}