package com.ronnie.cryptoprices.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;


@Service
public class CryptoPriceService {
    private final String API_URL = "https://api.coingecko.com/api/v3/simple/price?ids=bitcoin,etherum&vs_currencies=usd";

    public Map<String, Map<String, Double>> getCryptoPrices(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, Map.class);
    }
}
