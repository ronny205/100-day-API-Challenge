package com.ronnie.nasapod.service;

import com.ronnie.nasapod.model.NasaPodResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Service
public class NasaPodService {

    private static final String NASA_APOD_URL = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY";

    public NasaPodResponse fetchPod() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(NASA_APOD_URL, NasaPodResponse.class);
    }
}
