package com.micro.user.controllers;

import com.micro.user.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.micro.user.service.UserServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserServiceImpl userService;
//creaat user  @RequestBody ka use isliye kyuki hum jsn se data bejenge to vo desrilize hoga isse
    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user){
       UserEntity userEntity= userService.saveUser(user);
      return ResponseEntity.status(HttpStatus.CREATED).body(userEntity);
    }
    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUser(){
       List<UserEntity> list = userService.getAllUser();
       return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> getUserById(@PathVariable String userId){
UserEntity user =userService.getUser(userId);
return ResponseEntity.ok().body(user);
    }
}
