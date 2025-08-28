package com.ronnie.dictionary.service;


import com.ronnie.dictionary.model.DictionaryResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class DictionaryService {

    private static final String API_URL = "https://api.dictionaryapi.dev/api/v2/entries/en/";

    public List<DictionaryResponse> getWordMeaning(String word) {
        RestTemplate restTemplate = new RestTemplate();
        DictionaryResponse[] response = restTemplate.getForObject(API_URL + word, DictionaryResponse[].class);
        return Arrays.asList(response);
    }
}

