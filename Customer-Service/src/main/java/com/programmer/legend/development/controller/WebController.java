package com.programmer.legend.development.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/")
    public String hello(){
        return "Hello from Customer-Service!!";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome from Customer-Service!!!";
    }

}
