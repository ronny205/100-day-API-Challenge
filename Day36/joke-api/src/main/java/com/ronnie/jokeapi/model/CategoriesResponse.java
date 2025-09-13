package com.ronnie.jokeapi.model;

import lombok.Data;

import java.util.List;

@Data
public class CategoriesResponse {
    private List<String> categories;

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

}
