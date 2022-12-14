package com.example.rickandmortyapi.controller;

import com.example.rickandmortyapi.entitii.Character;
import com.example.rickandmortyapi.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private ApiService apiService;

    @GetMapping("/")
             public  ResponseEntity<Character>getCharacters(){
              Character allCharacters = apiService.getAllCharacter();
              return new ResponseEntity<>(allCharacters, HttpStatus.OK);
    };




}
