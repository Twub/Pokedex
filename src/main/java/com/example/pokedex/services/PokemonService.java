package com.example.pokedex.services;

import com.example.pokedex.dto.PokemonDto;
import com.example.pokedex.entities.Pokemon;
import com.example.pokedex.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class PokemonService {
    private final RestTemplate restTemplate;
    private static final String URL = "https://pokeapi.co/api/v2/pokemon/";

    public PokemonService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public PokemonDto search(String name){
        var urlWithNameQuery = URL + name;

        var pokemon = restTemplate.getForObject(urlWithNameQuery, PokemonDto.class);
        System.out.println(pokemon);
        if (pokemon != null){
            System.out.println("Pokemon: " + pokemon.getName());
        }else {
            System.out.println("No pokemons found.");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No pokemon found!");
        }
        return pokemon;
    }

    public PokemonDto search(int id){
        var urlWithNameQuery = URL + id;

        var pokemon = restTemplate.getForObject(urlWithNameQuery, PokemonDto.class);

        if (pokemon != null){
            System.out.println("Pokemon: " + pokemon.getName());
        }else {
            System.out.println("No pokemons found.");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No pokemon found!");
        }
        return pokemon;
    }
}
