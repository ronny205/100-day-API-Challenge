package com.ronnie.mealapi.controller;

import com.ronnie.mealapi.model.Meal;
import com.ronnie.mealapi.service.MealService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/meals")
public class MealController {

    private final MealService mealService;

    public MealController (MealService mealService) {
        this.mealService = mealService;
    }

    public Meal getMealByName(@PathVariable String name) {
        return mealService.getMealByName(name);
    }
}
