package com.example.rickandmortyapi.entitii;

import lombok.Data;

import java.util.Date;

@Data
public class Result {

    private Integer id;
    private String name;
    private String gender;
    private String status;
    private String species;
    private String type;
    private String image;
    private Origin origin;


}
