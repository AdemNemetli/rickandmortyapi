package com.example.rickandmortyapi.entitii;

import lombok.Data;

import java.util.List;
@Data
public class Character {

    private Info info;
    private List <Result> results;
}
