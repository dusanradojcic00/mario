package com.example.gateway.dto.mapper;

import com.example.domain.model.User;
import com.example.gateway.dto.model.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserDto toUserDto(User user) {
        return new UserDto()
                .setUsername(user.getUsername())
                .setId(user.getId())
                .setEmail(user.getEmail());
    }

    public static User fromUserDto(UserDto userDto){
        return new User().setUsername(userDto.getUsername())
                .setId(userDto.getId())
                .setEmail(userDto.getEmail());
    }

}
