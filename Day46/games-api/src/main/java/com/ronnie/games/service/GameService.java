package com.ronnie.games.service;

import com.ronnie.games.model.GameResponse;
import lombok.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Service
public class GameService {

    @Value("${rawg.api.url}")
    private String apiUrl;

    @Value("${rawg.api.url}")
    private String apiKey;

    public GameResponse getGameDetails(String gameSlug) {
        RestTemplate restTemplate = new RestTemplate();
        String url = apiUrl + "/games/" + gameSlug + "?key=" + apikey;
        return restTemplate.getForObject(Url, GameResponse.class);
    }
}
