package com.ronnie.moviequotes.controller;

import com.ronnie.moviequotes.model.QuotesModel;
import com.ronnie.moviequotes.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuotesController {

    @Autowired
    private QuotesService quotesService;

    public QuotesModel getQuote() {
        return QuotesService.getRandomQuote();
    }

}
