package com.micro.user.repositries;

import com.micro.user.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
//database opratioan already h jparepo to hume bus kispe perform krna h or uski id kis type ki h vo dena h
public interface UserRepo extends JpaRepository<UserEntity,String> {
    //isme hume get put delete mil jayega
    //if you want to implemnet custom method an query you can write here
}
