package com.example.gateway.controller;

import com.example.domain.model.User;
import com.example.domain.services.UserService;
import com.example.gateway.dto.mapper.UserMapper;
import com.example.gateway.dto.model.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<?> getUser(@PathVariable String userId) {
        User user = userService.getUser(userId);
        UserDto userDto = UserMapper.toUserDto(user);
        return ResponseEntity.ok(userDto);
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers(){
        List<User> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserDto userDto){
        User user = UserMapper.fromUserDto(userDto);
        userService.addUser(user);
        return ResponseEntity.ok(user);
    }


}
