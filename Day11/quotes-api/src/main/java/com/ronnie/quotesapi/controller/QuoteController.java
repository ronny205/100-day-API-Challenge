package com.ronnie.quotesapi.controller;

import com.ronnie.quotesapi.model.QuoteModel;
import com.ronnie.quotesapi.service.QuoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/quotes")
public class QuoteController {

    private final QuoteService quoteService;

    public QuoteController (QuoteService quoteService){
        this.quoteService = quoteService;
    }

    @GetMapping("/random")
    public QuoteModel getRandomQuote() {
        return quoteService.getRandomQuote();
    }
}
