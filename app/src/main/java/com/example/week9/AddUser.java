package com.example.week9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class AddUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editTextEmailAddress = findViewById(R.id.editTextEmailAddress);
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        Button button = findViewById(R.id.button);

        UserStorage userStorage = UserStorage.getInstance();

        button.setOnClickListener(view -> {
            String firstName = editTextFirstName.getText().toString();
            String lastName = editTextLastName.getText().toString();
            String emailAddress = editTextEmailAddress.getText().toString();

            int radioButtonID = radioGroup.getCheckedRadioButtonId();
            View radioButton = radioGroup.findViewById(radioButtonID);
            int index = radioGroup.indexOfChild(radioButton);
            RadioButton rButton = (RadioButton) radioGroup.getChildAt(index);
            String selectedDegreeProgram = rButton.getText().toString();

            User user = new User(firstName, lastName, emailAddress, selectedDegreeProgram);
            userStorage.addUser(user);
        });
    }
}