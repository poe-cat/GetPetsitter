package org.poecat.services;

import org.poecat.entities.User;

import java.util.HashMap;
import java.util.Map;

public class AuthService {

    private Map<String, User> users = new HashMap<>();

    //add new user to database
    public void register(User user) {
        users.put(user.getUsername(), user);
    }

    public User login(String username, String password) {
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
