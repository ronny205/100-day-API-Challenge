package com.ronnie.randomuserapi.controller;


import com.ronnie.randomuserapi.model.RandomUserResponse;
import com.ronnie.randomuserapi.service.RandomUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomUserController {

    @Autowired
    private RandomUserService randomUserService;

    @GetMapping("/api/random-user")
    public RandomUserResponse getRandomUser() {
        return randomUserService.getRandomUser();
    }
}
