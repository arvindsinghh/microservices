package com.micro.user.exceptions;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder    //to foloow build pattern to build this class
public class ApiResponse {
    private  boolean success;
    private String message;
    private HttpStatus status;


}
