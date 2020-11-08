package com.example.pokemon.controllers;

import com.example.pokemon.entities.Pokemon;
import com.example.pokemon.services.PokemonConsumerService;
import com.example.pokemon.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pokemon")
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;
    @Autowired
    private PokemonConsumerService pokemonConsumerService;

    @GetMapping("/test")
    public void findAllPokemon(){
        pokemonConsumerService.getAllPokemonsFromApi();
    }

    @GetMapping
    public ResponseEntity<List<Pokemon>> findPokemon(@RequestParam String name, @RequestParam(required = false) String type){
        var pokemon = pokemonService.findPokemonByName(name,type);
        return ResponseEntity.ok(pokemon);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> findPokemonById(@PathVariable String id){
        return ResponseEntity.ok(pokemonService.findById(id));
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @Secured("ROLE_ADMIN")
    public ResponseEntity<Pokemon> savePokemon(@RequestBody Pokemon pokemon){
        var savedPokemon = pokemonService.save(pokemon);
        var uri = URI.create("/api/v1/pokemon/" + savedPokemon.getPokemonID());
        return ResponseEntity.created(uri).body(savedPokemon);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Secured("ROLE_ADMIN")
   public void updatePokemon(@PathVariable String id, @RequestBody Pokemon pokemon){
        pokemonService.update(id, pokemon);
   }

   @DeleteMapping("{id}")
   @ResponseStatus(HttpStatus.NO_CONTENT)
   @Secured("ROLE_ADMIN")
   public void deletePokemon(@PathVariable String id){
        pokemonService.delete(id);
   }



}
