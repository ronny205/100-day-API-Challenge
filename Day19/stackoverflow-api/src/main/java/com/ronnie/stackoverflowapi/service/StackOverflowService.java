package com.example.stackoverflowapi.service;

import com.example.stackoverflowapi.model.StackOverflowResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class StackOverflowService {
    private static final String API_URL =
            "https://api.stackexchange.com/2.3/questions?order=desc&sort=creation&site=stackoverflow";

    public StackOverflowResponse getLatestQuestions() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(API_URL, StackOverflowResponse.class);
    }
}
