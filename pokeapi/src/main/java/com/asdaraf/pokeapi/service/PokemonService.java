package com.asdaraf.pokeapi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {

    private final String API_URL = "https://pokeapi.co/api/v2/pokemon/";

    public ResponseEntity<String> getPokemon(String name) {
        RestTemplate restTemplate = new RestTemplate();
        return ResponseEntity.ok(restTemplate.getForObject(API_URL + name, String.class));
    }

}
