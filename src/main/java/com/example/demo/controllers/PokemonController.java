package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTOs.PokemonDTO;
import com.example.demo.repository.PokeApi;

@RestController
public class PokemonController {
    @Autowired
    private PokeApi pokeApi;

    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO gPokemonDTO(@PathVariable ("pokemonId") int pokemonId){
        return pokeApi.getPokemonInfo(pokemonId);
    }

}
