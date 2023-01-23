package com.micro.user.service;

import com.micro.user.entities.UserEntity;

import java.util.List;

public interface UserService {
    //user info
    //create user
    UserEntity saveUser(UserEntity user);

    //get all user
    List<UserEntity> getAllUser();

    //getSingle user
    UserEntity getUser(String userId);

    //todo :delete
    //todo: pdate
}
