package com.example.pokemon.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

public class Pokemon implements Serializable {
    private static final long serialVersionUID = -865214149412787221L;
    @Id
    private String pokemonID;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Height")
    private int height;
    @JsonProperty("Weight")
    private int weight;
    @JsonProperty("Base Experience")
    private int baseExperience;
    @JsonProperty("Location Encounter")
    private String locationEncounter;
    @JsonProperty("Types")
    private List<Object> types;
    @JsonProperty("Abilities")
    private List<Object> abilities;
    @JsonProperty("Games")
    private List<Object> game_indices;

    public Pokemon(){

    }

    public Pokemon(String name, int height, int weight, int baseExperience, String locationEncounter, List<Object> types, List<Object> abilities, List<Object> games) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.baseExperience = baseExperience;
        this.locationEncounter = locationEncounter;
        this.types = types;
        this.abilities = abilities;
        this.game_indices = games;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(String pokemonID) {
        this.pokemonID = pokemonID;
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
        return locationEncounter;
    }

    public void setLocationEncounter(String locationEncounter) {
        this.locationEncounter = locationEncounter;
    }

    public List<Object> getTypes() {
        return types;
    }

    public void setTypes(List<Type> Object) {
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
