package com.ronnie.tides.service;

import com.ronnie.tides.model.TideResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TideService {

    @Value("${worldtides.api.url}")
    private String apiUrl;

    @Value("${worldtides.api.key}")
    private String apiKey;

    public TideResponse getTides(double lat, double lon) {
        RestTemplate restTemplate = new RestTemplate();
        String url = apiUrl + "?extremes&lat=" + lat + "&lon=" + lon + "&key=" + apiKey;
        return restTemplate.getForObject(url, TideResponse.class);
    }
}
