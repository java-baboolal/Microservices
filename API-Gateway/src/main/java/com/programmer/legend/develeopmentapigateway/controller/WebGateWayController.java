package com.programmer.legend.develeopmentapigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebGateWayController {

    @GetMapping("/")
    public String hello(){
        return "Hello from GateWay-Service!!";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome from GateWay-Service!!!";
    }

}
