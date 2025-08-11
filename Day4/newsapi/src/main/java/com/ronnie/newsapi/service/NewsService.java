package com.ronnie.newsapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    private String apiKey;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getTopHeadlines(String country){
    String url = "https://newsapi.org/v2/top-headlines?country=" + country + "&apikey=" + apiKey;
    return restTemplate.getForObject(url,String .class);
}
}
