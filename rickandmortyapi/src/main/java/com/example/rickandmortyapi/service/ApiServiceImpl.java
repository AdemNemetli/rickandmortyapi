package com.example.rickandmortyapi.service;

import com.example.rickandmortyapi.entitii.Character;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
@Service
public class ApiServiceImpl implements ApiService{
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpHeaders httpHeaders;

    private static final String CHARACTER_API = "https://rickandmortyapi.com/api/character";

    @Override
    public Character getAllCharacter() {

        httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

      ResponseEntity<Character> response =  restTemplate.exchange(CHARACTER_API, HttpMethod.GET,entity, Character.class);


      return response.getBody();
    }
}
