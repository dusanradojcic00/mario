package com.example.domain.repo;

import com.example.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo {
    public User getUser(String id);
    public void addUser(User user);
    public List<User> getAllUsers();
}
