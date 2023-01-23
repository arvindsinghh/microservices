package com.micro.user.service;

import com.micro.user.exceptions.ResourceNotFound;
import com.micro.user.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import com.micro.user.repositries.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public UserEntity saveUser(UserEntity user) {
        //for uniqe Id for user we use UUID
        String  userId=UUID.randomUUID().toString();
        user.setUserId(userId);
        return userRepo.save(user);
    }

    @Override
    public List<UserEntity> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public UserEntity getUser(String userId) {

               UserEntity userEntity= userRepo.findById(userId).orElseThrow(()->new ResourceNotFound("User not Found"));
        return userEntity;
    }
}
