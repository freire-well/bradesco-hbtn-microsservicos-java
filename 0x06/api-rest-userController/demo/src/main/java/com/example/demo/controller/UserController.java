package com.example.demo.controller;

import com.example.demo.exception.CPFException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping("/user-id/{id}")
    public String findUserById(@PathVariable int id) {

        String msg = "You have entered invalid ID";
        // TODO
        return msg;
    }

    @GetMapping("/user-name/{userName}")
    public String findUserByName(@PathVariable String userName) {
        if(!isValidString(userName)){
            throw new CPFException("You have entered invalid USERNAME");
        }
        String msg = "You have entered valid USERNAME";
        // TODO
        return msg;
    }

    @GetMapping("/user-cpf/{cpf}")
    public String findUserByCPF(@PathVariable String cpf) {

        String msg = "You have entered valid CPF";
        if(!isValidString(cpf)){
            throw new CPFException("You have entered invalid CPF");
        }
        return msg;

    }

    public boolean isValidString(String test) {
        return test.length() > 3 && test.length() < 15;
    }



}
