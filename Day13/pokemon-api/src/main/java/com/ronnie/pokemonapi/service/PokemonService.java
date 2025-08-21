package com.ronnie.pokemonapi.service;

import com.ronnie.pokemonapi.model.PokemonModel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ResourceBundle;

@Service
public class PokemonService {
    private static final String POKEMON_API_URL =  "https://pokeapi.co/api/v2/pokemon/{name}";

    public Pokemon getPokemonDetails(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(POKEMON_API_URL, PokemonModel.class, name.toLowerCase());
    }
}
