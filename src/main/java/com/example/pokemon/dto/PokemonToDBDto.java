package com.example.pokemon.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PokemonToDBDto {

    private String name;

    private int height;

    private int weight;

    private int baseExperience;

    private String location_area_encounters;

    private List<Object> types;

    private List<Object> abilities;

    private List<Object> game_indices;
    private String url;

    public PokemonToDBDto() {
    }

    public PokemonToDBDto(String name, int height, int weight, int baseExperience, String location_area_encounters, List<Object> types, List<Object> abilities, List<Object> game_indices, String url) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.location_area_encounters = location_area_encounters;
        this.types = types;
        this.abilities = abilities;
        this.game_indices = game_indices;
        this.url = url;
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

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
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

    public List<Object> getGame_indices() {
        return game_indices;
    }

    public void setGame_indices(List<Object> game_indices) {
        this.game_indices = game_indices;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
