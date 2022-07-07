package com.todo.todoapp.exceptions;

import org.springframework.http.HttpStatus;

public class CustomAppException extends RuntimeException{
    private  final HttpStatus status;
    public CustomAppException(String message, HttpStatus status){

        super(message);
        this.status = status;
    }
}
