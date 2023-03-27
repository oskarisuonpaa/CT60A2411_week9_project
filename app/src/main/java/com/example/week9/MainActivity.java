package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonAddUser = findViewById(R.id.buttonAddUser);
        Button buttonListUsers = findViewById(R.id.buttonListUsers);

        buttonAddUser.setOnClickListener(view -> {
            Intent switchActivityIntent = new Intent(this, AddUser.class);
            startActivity(switchActivityIntent);
        });

        buttonListUsers.setOnClickListener(view -> {
            Intent switchActivityIntent = new Intent(this, ListUsers.class);
            startActivity(switchActivityIntent);
        });
    }
}