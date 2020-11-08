package com.example.pokemon.entities;

import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

public class PokeApiHarvest implements Serializable {
    private static final long serialVersionUID = 4163605045098458405L;

    private String name;

    private int height;

    private int weight;

    private int baseExperience;

    private String location_area_encounters;

    private List<Object> types;

    private List<Object> abilities;

    private List<Object> game_indices;

    public PokeApiHarvest(String name, int height, int weight, int baseExperience, String location_area_encounters, List<Object> types, List<Object> abilities, List<Object> game_indices) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.location_area_encounters = location_area_encounters;
        this.types = types;
        this.abilities = abilities;
        this.game_indices = game_indices;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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
}
