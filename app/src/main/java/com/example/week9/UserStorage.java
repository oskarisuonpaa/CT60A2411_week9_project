package com.example.week9;

import java.util.ArrayList;

public class UserStorage {
    private static volatile UserStorage instance = null;
    private ArrayList<User> users = new ArrayList<User>();

    private  UserStorage(){};

    public static UserStorage getInstance() {
        if (instance == null) {
            synchronized (UserStorage.class) {
                if (instance == null) {
                    instance = new UserStorage();
                }
            }
        }
        return instance;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(int id){};
}
