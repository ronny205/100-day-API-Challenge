package com.ronnie.cocktailapi.model;

import java.util.List;

public class DrinkResponse {

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    private List<Drink> drinks;


}
