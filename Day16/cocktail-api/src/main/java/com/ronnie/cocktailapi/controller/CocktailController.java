package com.ronnie.cocktailapi.controller;

import com.ronnie.cocktailapi.service.CocktailService;
import com.ronnie.cocktailapi.model.Drink;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cocktails")
public class CocktailController {

    private final CocktailService cocktailService;

    public CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    public Drink getDrinkByName(@PathVariable String name) {
        return cocktailService.getDrinkByName(name);
    }
}
