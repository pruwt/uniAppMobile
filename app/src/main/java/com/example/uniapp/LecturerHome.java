package com.example.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LecturerHome extends AppCompatActivity {
Button stugrades,summary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stugrades = findViewById(R.id.stugrades);
       summary= findViewById(R.id.summary);

       Intent intent = getIntent();

       stugrades.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(),StudentGrades.class);
                intent.putExtra("K1",0);
                startActivity(intent);
           }
       });

       summary.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(),StudentSummary.class);
               intent.putExtra("K1",0);
               startActivity(intent);
           }
       });
    }
}