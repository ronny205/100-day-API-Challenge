package com.ronnie.dogimages.service;

import com.ronnie.dogimages.model.DogApiResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DogImageService {
    private static final String DOG_API_URL = "https://dog.ceo/api/breeds/image/random";

    public String fetchRandoomDogImage(){
        RestTemplate restTemplate = new RestTemplate();

        DogApiResponse response = restTemplate.getForObject(DOG_API_URL, DogApiResponse.class);

        if( response != null && response.getMessage() != null ) {
            return response.getMessage();
        }
        return "No image available";
    }
}
