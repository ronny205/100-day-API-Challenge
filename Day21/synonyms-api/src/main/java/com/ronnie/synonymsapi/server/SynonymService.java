package com.ronnie.synonymsapi.server;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

@Service
public class SynonymService {

    private final RestTemplate restTemplate;

    public SynonymService(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }

    public List<Map<String, Object>> fetchSynonyms(String word) {
        String url = "https://api.datamuse.com/words?rel_syn=" + word;
        ResponseEntity<List> response = restTemplate.getForEntity(url, List.class);
        return response.getBody();
    }
}

