package com.ronnie.memegenerator.controller;

import com.ronnie.memegenerator.model.MemeResponse;
import com.ronnie.memegenerator.service.MemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemeController {

    @Autowired
    private MemeService memeService;

    @GetMapping("/api/meme")
    public MemeResponse getMeme() {
        return memeService.getRandomMeme();
    }
}
