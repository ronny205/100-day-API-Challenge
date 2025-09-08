package com.ronnie.horoscopeapi.service;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class HoroscopeService {

    private final String API_URL = "https://aztro.sameerkumar.website/";

    public Map<String, Object> getHoroscope(String sign, String day) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + "?sign=" + sign + "&day=" + day;

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<Map> response = restTemplate.exchange(url, HttpMethod.POST, entity, Map.class);

        return response.getBody();
    }
}
