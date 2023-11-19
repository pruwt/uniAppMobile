package com.example.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.firestore.FirebaseFirestore;

public class StudentSummary extends AppCompatActivity {
TextView studentNameTextView,assignment1TextView,assignment2TextView,cat1TextView,cat2TextView,exam1TextView;
Button homebtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_student_summary);
        studentNameTextView = findViewById(R.id.studentNameTextView);
        assignment1TextView = findViewById(R.id.assignment1TextView);
        assignment2TextView= findViewById(R.id.assignment2TextView);
        cat1TextView = findViewById(R.id.cat1TextView);
        cat2TextView = findViewById(R.id.cat2TextView);
        exam1TextView = findViewById(R.id.exam1TextView);
        homebtn = findViewById(R.id.homebtn);

        FirebaseFirestore db = FirebaseFirestore.getInstance();
    }
}