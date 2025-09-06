package com.ronnie.lastfm.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ArtistService {

    // Replace with your actual Last.fm API key
    private final String API_KEY = "YOUR_LASTFM_API_KEY";
    private final String API_URL = "http://ws.audioscrobbler.com/2.0/?method=artist.getinfo&format=json&artist=";

    public Map<String, Object> getArtistDetails(String name) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + name + "&api_key=" + API_KEY;
        return restTemplate.getForObject(url, Map.class);
    }
}
