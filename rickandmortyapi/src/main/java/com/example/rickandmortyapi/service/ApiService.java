package com.example.rickandmortyapi.service;

import com.example.rickandmortyapi.entitii.Character;
import org.springframework.stereotype.Service;

@Service
public interface ApiService {
   public Character getAllCharacter();

}
