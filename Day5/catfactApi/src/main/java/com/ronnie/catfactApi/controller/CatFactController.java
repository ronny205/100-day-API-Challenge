package com.ronnie.catfactApi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CatFactController {

    @GetMapping("/catFact")
    public String getCatFact() {
        return "Cats have five toes on their front paws, but only four on the back ones!";
    }

    @GetMapping("/catFact2")
    public String getSecondCatFact() {
        return "A group of cats is called a clowder!";
    }
}