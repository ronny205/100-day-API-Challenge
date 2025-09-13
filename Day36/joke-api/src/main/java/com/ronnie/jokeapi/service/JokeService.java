package com.ronnie.jokeapi.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class JokeService {

    private static final String CATEGORIES_URL = "https://v2.jokeapi.dev/categories";

    public List<String> getCategories() {
        RestTemplate restTemplate = new RestTemplate();
        // JokeAPI returns { "error": false, "categories": [...] }
        var response = restTemplate.getForObject(CATEGORIES_URL, JokeApiResponse.class);
        return response.getCategories();
    }

    // Inner class to map the API response
    private static class JokeApiResponse {
        private boolean error;
        private List<String> categories;

        public List<String> getCategories() {
            return categories;
        }

        public void setCategories(List<String> categories) {
            this.categories = categories;
        }

        public boolean isError() {
            return error;
        }

        public void setError(boolean error) {
            this.error = error;
        }
    }
}
