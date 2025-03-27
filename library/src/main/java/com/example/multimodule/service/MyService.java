package com.example.multimodule.service;

import org.springframework.stereotype.Service;

import com.example.multimodule.models.User;

@Service
public class MyService {
    public String getMessage() {


        User u = new User();
        u.name = "teste";



        return "Hello from Library! "+u.name;
    }
}