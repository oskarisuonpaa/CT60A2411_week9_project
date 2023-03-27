package com.example.week9;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        User user = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_view, parent, false);
        }
        TextView textViewUserName = convertView.findViewById(R.id.textViewUserName);
        TextView textViewDegreeProgram = convertView.findViewById(R.id.textViewDegreeProgram);
        TextView textViewEmailAddress = convertView.findViewById(R.id.textViewEmailAddress);

        textViewUserName.setText(String.format("%s %s", user.getFirstName(), user.getLastName()));
        textViewDegreeProgram.setText(user.getDegreeProgram());
        textViewEmailAddress.setText(user.getEmail());

        return convertView;
    }
}
