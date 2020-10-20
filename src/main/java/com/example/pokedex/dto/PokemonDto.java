package com.example.pokedex.dto;

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
    private int base_experience;
    @JsonProperty("Location Encounter")
    private String location_area_encounters;
    @JsonProperty("Types")
    private List<Object> types;
    @JsonProperty("Abilities")
    private List<Object> abilities;
    @JsonProperty("Games")
    private List<Object> game_indices;
    @JsonProperty("Species")
    private Object species;

    public PokemonDto(String name, int height, int weight, int base_experience, String location_area_encounters, List<Object> types, List<Object> abilities, List<Object> game_indices, Object species) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.base_experience = base_experience;
        this.location_area_encounters = location_area_encounters;
        this.types = types;
        this.abilities = abilities;
        this.game_indices = game_indices;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getBase_experience() {
        return base_experience;
    }

    public String getLocationEncounter() {
        return location_area_encounters;
    }

    public List<Object> getTypes() {
        return types;
    }

    public List<Object> getAbilities() {
        return abilities;
    }

    public List<Object> getGame_indices() {
        return game_indices;
    }

    public Object getSpecies() {
        return species;
    }
}
