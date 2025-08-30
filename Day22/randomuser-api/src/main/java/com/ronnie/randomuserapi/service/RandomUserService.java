package com.ronnie.randomuserapi.service;


import com.ronnie.randomuserapi.model.RandomUserResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RandomUserService {

    private static final String API_URL = "https://randomuser.me/api/";

    public RandomUserResponse getRandomUser() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, RandomUserResponse.class);
    }
}
