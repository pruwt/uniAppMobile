package com.example.uniapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class studentDashboard extends AppCompatActivity {

    Button registrationbtn, registeredbtn, profilebtn, logoutbtn, reportbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        registrationbtn = findViewById(R.id.registrationbtn);
        registeredbtn = findViewById(R.id.registeredbtn);
        profilebtn = findViewById(R.id.profilebtn);
        logoutbtn = findViewById(R.id.logoutbtn);
        reportbtn = findViewById(R.id.reportbtn);

        registrationbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });

//        registeredbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity6.class);
//                startActivity(intent);
//            }
//        });

//        profilebtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity4.class);
//                startActivity(intent);
//            }
//        });

//        reportbtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), MainActivity5.class);
//                startActivity(intent);
//            }
//        });
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate back to the login page (MainActivity)
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                // Finish the current activity to prevent going back to MainActivity2 when pressing the back button
                finish();
            }
        });
    }
}
