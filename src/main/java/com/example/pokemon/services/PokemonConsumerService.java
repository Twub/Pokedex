package com.example.pokemon.services;

import com.example.pokemon.dto.PokeApiHarvestDto;
import com.example.pokemon.dto.PokemonDto;
import com.example.pokemon.entities.PokeApiHarvest;
import com.example.pokemon.repositories.PokeApiHarvestRepository;
import com.example.pokemon.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Service
//@ConfigurationProperties(value = "example.pokemon", ignoreUnknownFields = false)
public class PokemonConsumerService {
    private final RestTemplate restTemplate;

    private String url = "https://pokeapi.co/api/v2/pokemon/";

    @Autowired
    private PokeApiHarvestRepository pokeApiHarvestRepository;

    @Autowired
    private PokemonRepository pokemonRepository;


    public PokemonConsumerService(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public PokemonDto search(String name){
        var urlWithNameQuery = url + name;
        var pokemon = restTemplate.getForObject(urlWithNameQuery, PokemonDto.class);
        if(pokemon == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "no pokemon found..");
        }
       return pokemon;
    }

    public PokemonDto search(String name, String location){
        var urlWithNameQuery = url;
        int weightInInt = Integer.parseInt(location);
        if (weightInInt > 0){
            urlWithNameQuery = url + name + "&" + location;
        }else {
            return null;
        }
        var pokemon = restTemplate.getForObject(urlWithNameQuery, PokemonDto.class);
        if(pokemon == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "no pokemon found..");
        }
        return pokemon;
    }


    public void getAllPokemonsFromApi(){
        var urlWithQuery = url + "?limit=2000&offset=0";
        var pokemons = restTemplate.getForObject(urlWithQuery, PokeApiHarvestDto.class);
        pokemons.getResults().forEach(pokemon -> pokeApiHarvestRepository.save(new PokeApiHarvest(pokemon.getName(), pokemon.getHeight(), pokemon.getWeight(), pokemon.getBaseExperience(), pokemon.getLocation_area_encounters(), pokemon.getTypes(), pokemon.getAbilities(), pokemon.getGame_indices())));
    }


    public void setUrl(String url){
        this.url = url;
    }





}
