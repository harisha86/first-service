package com.apigateway.firstservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstService")
public class FirstServiceController {
    
    @GetMapping("/getFirstService")
    public String getFirst() {
        return "Welcome to the First service controller";
    }
}
