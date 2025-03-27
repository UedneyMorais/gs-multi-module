package com.example.multimodule.application.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import com.example.multimodule.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(scanBasePackages = "com.example.multimodule")
@RestController
public class DemoController {

    private final MyService myService;

    public DemoController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        return myService.getMessage();
    }
    
}
