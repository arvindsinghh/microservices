package com.micro.user.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //pure project ka centrize excption ko yaha handle kr sakte h pure project ki
public class GlobleExcptionHandler {
    //for Respone code
    @ExceptionHandler(ResourceNotFound.class)//yha vo class deni h jo kahi bhi call ho to yaha aa jayega
    public ResponseEntity<ApiResponse> handleResourceNotFoundExcption(ResourceNotFound resourceNotFound){
//builder pattern to build a object in one line by method chaining
        String message=resourceNotFound.getMessage();
       ApiResponse response= ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
