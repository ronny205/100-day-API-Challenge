package com.ronnie.geolocation.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class IpApiService {

    private final String API_URL = "http://ip-api.com/json/";

    public Map<String, Object> getIpGeolocation(String ip) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL + ip, Map.class);
    }
}
