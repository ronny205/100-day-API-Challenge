package com.ronnie.pokemonapi.model;

import java.util.List;

public class PokemonModel {
    private int id;
    private String name;
    private int height;
    private int weight;
    private List<TypeSlotModel> types;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public List<TypeSlotModel> getTypes() {
        return types;
    }

    public void setTypes(List<TypeSlotModel> types) {
        this.types = types;
    }



}
