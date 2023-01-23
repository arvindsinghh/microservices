package com.micro.user.exceptions;

//here we create our custome excption so we can throw at the time of requirement
public class ResourceNotFound extends RuntimeException  {
//extrra properties if you want
   public ResourceNotFound(){
        super("Resource not found");
    }
    public  ResourceNotFound(String message){
       super(message);
    }
}
