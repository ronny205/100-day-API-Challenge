package com.ronnie.triviaapi.controller;

import com.ronnie.triviaapi.model.TriviaQuetionModel;
import com.ronnie.triviaapi.service.TriviaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/trivia")
public class TriviaController {

    private final TriviaService triviaService;

    public TriviaController (TriviaService triviaService) {
        this.triviaService = triviaService;
    }

    public TriviaQuetionModel getRandomTrivia() {
        return triviaService.getRandomTrivia();
    }
}
