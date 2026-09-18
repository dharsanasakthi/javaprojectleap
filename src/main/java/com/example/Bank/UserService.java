package com.example.Bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public User getUser(int id) {

        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }

        return null;
    }

    public void add(User user) {
        users.add(user);
    }

    public void updateUser(int id, User newUser) {

        for (int i = 0; i < users.size(); i++) {

            if (users.get(i).getId() == id) {
                users.set(i, newUser);
                return;
            }
        }
    }

    public void deleteUser(int id) {

        for (int i = 0; i < users.size(); i++) {

            if (users.get(i).getId() == id) {
                users.remove(i);
                return;
            }
        }
    }
}