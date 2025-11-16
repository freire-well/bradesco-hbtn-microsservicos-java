package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionService {

    @ExceptionHandler(value = CPFException.class)
    ResponseEntity<CPFException> handleException(CPFException err){
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.BAD_REQUEST.value());
        uer.setResponse(err.getMessage());
        return new ResponseEntity(uer,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = UserNameException.class)
    ResponseEntity<UserNameException> handleException(UserNameException err){
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.BAD_REQUEST.value());
        uer.setResponse(err.getMessage());
        return new ResponseEntity(uer,HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = UserIdException.class)
    ResponseEntity<UserIdException> handleException(UserIdException err){
        UserErrorResponse uer = new UserErrorResponse();
        uer.setStatus(HttpStatus.BAD_REQUEST.value());
        uer.setResponse(err.getMessage());
        return new ResponseEntity(uer,HttpStatus.BAD_REQUEST);
    }
}