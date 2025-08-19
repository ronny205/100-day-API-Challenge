package com.ronnie.quotesapi.service;

import com.ronnie.quotesapi.model.QuoteModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuoteService {
    private static final String RANDOM_QUOTE_URL = "https://api.quotable.io/random";

    public QuoteModel getRandomQuote(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(RANDOM_QUOTE_URL, QuoteModel.class);
    }

}
