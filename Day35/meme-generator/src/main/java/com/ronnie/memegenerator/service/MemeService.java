package com.ronnie.memegenerator.service;

import com.ronnie.memegenerator.model.MemeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MemeService {

    private static final String MEME_API_URL = "https://meme-api.com/gimme";

    public MemeResponse getRandomMeme() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(MEME_API_URL, MemeResponse.class);
    }
}
