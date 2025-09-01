package com.ronnie.exchangerate.service;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ExchangeRateService {

    private final String API_URL = "https://api.exchangerate-api.com/v4/latest/";

    public Map<String, Object> getExchangeRate(String base) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + base, Map.class);
    }
}
