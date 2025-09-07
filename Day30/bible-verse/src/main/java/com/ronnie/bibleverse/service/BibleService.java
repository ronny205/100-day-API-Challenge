package com.ronnie.bibleverse.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class BibleService {

    private final String API_URL = "https://bible-api.com/";

    public Map<String, Object> getVerse(String passage) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + passage, Map.class);
    }
}

