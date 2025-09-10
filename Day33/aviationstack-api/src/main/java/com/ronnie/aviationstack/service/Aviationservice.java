package com.ronnie.aviationstack.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class AviationService {

    private final String API_URL = "http://api.aviationstack.com/v1/flights?access_key=";

    public Map<String, Object> getFlights(String accessKey) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + accessKey, Map.class);
    }
}
