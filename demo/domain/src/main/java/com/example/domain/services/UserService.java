package com.example.domain.services;

import com.example.domain.model.User;
import com.example.domain.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    public User getUser(String userId) {
        return userRepo.getUser(userId);
    }

    public void addUser(User user) {
        userRepo.addUser(user);
    }


    public List<User> getAllUsers() {
        User user = new User();
        String email = user.getEmail();

        return userRepo.getAllUsers();
    }
}
