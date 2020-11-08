package com.example.pokemon.entities;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Ability {
    @Id
    private String id;
    private String name;
    private List<String> otherPokemons;

    public Ability(){

    }

    public Ability(String name, List<String> otherPokemons){
        this.name = name;
        this.otherPokemons = otherPokemons;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOtherPokemons() {
        return otherPokemons;
    }

    public void setOtherPokemons(List<String> otherPokemons) {
        this.otherPokemons = otherPokemons;
    }
}
