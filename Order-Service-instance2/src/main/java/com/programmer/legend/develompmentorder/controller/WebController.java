package com.programmer.legend.develompmentorder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @GetMapping("/")
    public String hello(){
        return "Hello from Order-Service instance 2!!";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome from Order-Service instance 2!!!";
    }

}
