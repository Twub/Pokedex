package com.example.pokedex.controllers;

import com.example.pokedex.dto.PokemonDto;
import com.example.pokedex.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pokemons")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping
    public ResponseEntity<PokemonDto> findPokemon(@RequestParam String name){
        var pokemon = pokemonService.search(name);
        return ResponseEntity.ok(pokemon);
    }


}
