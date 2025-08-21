package com.ronnie.pokemonapi.controller;

import com.ronnie.pokemonapi.service.PokemonService;
import com.ronnie.pokemonapi.model.PokemonModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @GetMapping("/{name}")
    public PokemonModel getPokemon(@PathVariable String name) {
        return pokemonService.getPokemonDetails(name);
    }
}
