package com.example.pokemon.dto;


import com.example.pokemon.entities.Ability;
import com.example.pokemon.entities.GameIndice;
import com.example.pokemon.entities.Type;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PokemonDto {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Height")
    private int height;
    @JsonProperty("Weight")
    private int weight;
    @JsonProperty("Base Experience")
    private int baseExperience;
    @JsonProperty("Location Encounter")
    private String location_area_encounters;
    @JsonProperty("Types")
    private List<Object> types;
    @JsonProperty("Abilities")
    private List<Object> abilities;
    @JsonProperty("Games implemented")
    private List<Object> game_indices;

    public PokemonDto(String name, int height, int weight, int baseExperience, String location_area_encounters, List<Object> types, List<Object> abilities, List<Object> game_indices) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.location_area_encounters = location_area_encounters;
        this.types = types;
        this.abilities = abilities;
        this.game_indices = game_indices;
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

    public int getBaseExperience() {
        return baseExperience;
    }

    public void setBaseExperience(int baseExperience) {
        this.baseExperience = baseExperience;
    }

    public String getLocationEncounter() {
        return location_area_encounters;
    }

    public void setLocationEncounter(String locationEncounter) {
        this.location_area_encounters = locationEncounter;
    }

    public List<Object> getTypes() {
        return types;
    }

    public void setTypes(List<Object> types) {
        this.types = types;
    }

    public List<Object> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Object> abilities) {
        this.abilities = abilities;
    }

    public List<Object> getGames() {
        return game_indices;
    }

    public void setGames(List<Object> games) {
        this.game_indices = games;
    }
}
