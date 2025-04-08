package com.example.demo.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.DTOs.PokemonDTO;

@FeignClient(name = "pokeapi", url="https://pokeapi.co/api/v2")
public interface PokeApi {

    @GetMapping("/pokemon/{pokemonId}")
    public PokemonDTO getPokemonInfo (@PathVariable ("pokemonId")int pokemonId);

}
