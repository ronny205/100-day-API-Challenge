package com.ronnie.helloWorldAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World";
    }

    public String greet(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}
