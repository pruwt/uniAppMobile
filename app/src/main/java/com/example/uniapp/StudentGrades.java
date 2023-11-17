package com.example.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentGrades extends AppCompatActivity {
Button gradesbtn,homebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_grades);

        gradesbtn = findViewById(R.id.gradesbtn);
        homebtn = findViewById(R.id.homebtn);

        Intent intent = getIntent();
        Integer value = intent.getIntExtra("K1",0);

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),LecturerHome.class);
                startActivity(intent);
            }
        });

        gradesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AddGrades.class);
                startActivity(intent);
            }
        });
    }
}