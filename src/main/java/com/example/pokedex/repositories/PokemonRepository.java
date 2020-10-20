package com.example.pokedex.repositories;

import com.example.pokedex.entities.Pokemon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PokemonRepository extends MongoRepository<Pokemon, String> {

    Optional<Pokemon> findByName(String name);
}
