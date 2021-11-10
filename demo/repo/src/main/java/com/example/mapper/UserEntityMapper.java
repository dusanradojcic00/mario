package com.example.mapper;

import com.example.domain.model.User;
import com.example.entity.UserEntity;

public class UserEntityMapper {
    public static UserEntity toUserEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setId(user.getId());
        return userEntity;
    }

    public static User fromUserEntity(UserEntity userEntity) {
        return new User()
                .setUsername(userEntity.getUsername())
                .setId(userEntity.getId());
    }
}
