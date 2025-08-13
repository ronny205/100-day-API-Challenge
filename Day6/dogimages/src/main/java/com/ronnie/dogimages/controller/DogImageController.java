package com.ronnie.dogimages.controller;

import com.ronnie.dogimages.service.DogImageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/dogs")
public class DogImageController {

    private final DogImageService dogImageService;

    public DogImageController(DogImageService dogImageService){
        this.dogImageService = dogImageService;
    }

    @GetMapping("/random")
    public String getRandomDogImage(){
        return dogImageService.fetchRandoomDogImage();
    }
}
