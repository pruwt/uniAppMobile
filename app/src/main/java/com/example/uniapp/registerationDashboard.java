package com.example.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registerationDashboard extends AppCompatActivity {
    Button register1btn, register2btn, register3btn, register4btn, register5btn, home1btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        register1btn = findViewById(R.id.register1btn);
        register2btn = findViewById(R.id.register2btn);
        register3btn = findViewById(R.id.register3btn);
        register4btn = findViewById(R.id.register4btn);
        register5btn = findViewById(R.id.register5btn);
        home1btn = findViewById(R.id.home1btn);

        home1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the login page (MainActivity)
                Intent intent = new Intent(getApplicationContext(), studentDashboard.class);
                startActivity(intent);
                // Finish the current activity to prevent going back to MainActivity2 when pressing the back button
                finish();
            }
        });
    }
}