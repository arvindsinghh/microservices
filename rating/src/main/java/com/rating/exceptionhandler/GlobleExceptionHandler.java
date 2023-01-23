package com.rating.exceptionhandler;

import com.rating.payloads.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobleExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse> handlerResourceNotFoundExcption(ResourceNotFoundException exception){
            String  message=exception.getMessage();
        ApiResponse apiResponse  =ApiResponse.builder().message(message).status(HttpStatus.NOT_FOUND).success(true).build();
        return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
    }
}
