package com.ronnie.games.controller;

import com.ronnie.games.model.GameResponse;
import com.ronnie.games.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/api.game")
    public GameResponse getGame (@RequestParam String slug) {
        return gameService.getGameDetails(slug);
    }
}
