package com.example.repo;

import com.example.domain.model.User;
import com.example.domain.repo.UserRepo;
import com.example.entity.UserEntity;
import com.example.mapper.UserEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class UserRepoImpl implements UserRepo {

    private final UserEntityRepo userEntityRepo;

    private List<User> users = new ArrayList<>();

    @Autowired
    public UserRepoImpl(UserEntityRepo userEntityRepo) {
        this.userEntityRepo = userEntityRepo;
    }

    @Override
    public User getUser(String id) {
        for (User u : users) {
            System.out.println(u.getId());
            if (u.getId().equals(id)) {
                return u;
            }
        }
        throw new RuntimeException("User not found");
    }

    @Override
    public void addUser(User user) {
        UserEntity userEntity = UserEntityMapper.toUserEntity(user);
        this.userEntityRepo.save(userEntity);
    }

    @Override
    public List<User> getAllUsers() {
        List<UserEntity> userEntities = userEntityRepo.findAll();
        return userEntities.stream().map(userEntity -> new User(userEntity.getId(), userEntity.getUsername()))
                .collect(Collectors.toList());
    }


}
