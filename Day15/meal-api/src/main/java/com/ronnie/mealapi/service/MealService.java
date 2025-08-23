package com.ronnie.mealapi.service;

import com.ronnie.mealapi.model.Meal;
import com.ronnie.mealapi.model.MealResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class MealService {

    private static final String SEARCH_URL =  "https://www.themealdb.com/api/json/v1/1/search.php?s={meal}";

    public Meal getMealByName (String mealName) {
        RestTemplate restTemplate = new RestTemplate();
        MealResponse response = restTemplate.getForObject(SEARCH_URL, MealResponse.class, mealName);

        if(response != null && response.getMeals() != null && !response.getMeals().isEmpty()){
            return response.getMeals().get(0);
        }
        return null;
    }
}
