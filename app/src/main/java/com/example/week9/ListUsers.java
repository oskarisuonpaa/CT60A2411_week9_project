package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListUsers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_users);

        ListView listView = findViewById(R.id.listView);

        UserStorage userStorage = UserStorage.getInstance();

        ArrayList<User> users = new ArrayList<User>();
        users = userStorage.getUsers();

        UsersAdapter adapter = new UsersAdapter(this, users);

        listView.setAdapter(adapter);
    }
}