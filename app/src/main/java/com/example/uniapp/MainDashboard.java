package com.example.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainDashboard extends AppCompatActivity {
    Button studentloginButton, lecturerloginButton, adminloginButton;

    EditText usernameEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentloginButton = findViewById(R.id.studentloginButton);
        lecturerloginButton = findViewById(R.id.lecturerloginButton);
        adminloginButton = findViewById(R.id.adminloginButton);
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

        studentloginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the entered username and password
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Proceed to the next activity
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("USERNAME", username);
                intent.putExtra("PASSWORD", password);
                startActivity(intent);
            }
        });

//        adminloginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = usernameEditText.getText().toString();
//                String password = passwordEditText.getText().toString();
//
//                // Proceed to the next activity
//                Intent intent = new Intent(getApplicationContext(), MainActivity7.class);
//                intent.putExtra("USERNAME", username);
//                intent.putExtra("PASSWORD", password);
//                startActivity(intent);
//            }
//        });
    }
}
