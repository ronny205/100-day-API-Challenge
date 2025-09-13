package com.ronnie.jokeapi.controller;

import com.ronnie.jokeapi.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JokeController {

    @Autowired
    private JokeService jokeService;

    @GetMapping("/api/jokes/categories")
    public List<String> getCategories() {
        return jokeService.getCategories();
    }
}

