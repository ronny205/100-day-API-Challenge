package com.ronnie.cocktailapi.service;

import com.ronnie.cocktailapi.model.DrinkResponse;
import com.ronnie.cocktailapi.model.Drink;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CocktailService {

    private static final String SEARCH_URL = "https://www.thecocktaildb.com/api/json/v1/1/search.php?s={drink}";

    public Drink getDrinkByName(String drinkName) {
        RestTemplate restTemplate = new RestTemplate();

        DrinkResponse response = restTemplate.getForObject(SEARCH_URL, DrinkResponse.class, drinkName);

        if(response != null && response.getDrinks() != null && !response.getDrinks().isEmpty()) {
            return response.getDrinks().get(0);
        }
        return null;
    }
}
