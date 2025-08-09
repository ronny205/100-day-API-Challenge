package com.ronnie.greeting.controller;


import com.ronnie.greeting.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/user/{name}")
    public User getUser(
            @PathVariable String name,
            @RequestParam int age,
            @RequestParam  double height,
            @RequestParam(defaultValue = "true")  boolean active
    ){
        return new User(name, age, height, active);
    }
}
