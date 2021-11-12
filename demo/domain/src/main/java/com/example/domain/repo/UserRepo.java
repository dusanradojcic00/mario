package com.example.domain.repo;

import com.example.domain.model.User;

import java.util.List;

public interface UserRepo {
    public User getUser(String id);
    public void addUser(User user);
    public List<User> getAllUsers();
}
