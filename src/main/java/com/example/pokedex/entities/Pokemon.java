package com.example.pokedex.entities;

import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.util.List;

public class Pokemon {
    @Id
    private String id;
    private String name;
    private int height;
    private int weight;
    private int baseExperience;
    private String locationEncounter;
    private List<Object> types;
    private List<Object> abilities;
    private List<Object> games;
    private Object specie;

    public Pokemon(){

    }

    public Pokemon(String name){
        this.name = name;
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
}
