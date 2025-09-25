package com.ronnie.moviequotes.service;

import com.ronnie.moviequotes.model.QuotesModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class QuotesService {

    private static final String MOVIE_QUOTE_URL = "";

    public QuotesModel getRandomQuote() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(MOVIE_QUOTE_URL, QuotesModel.class);
    }
}
