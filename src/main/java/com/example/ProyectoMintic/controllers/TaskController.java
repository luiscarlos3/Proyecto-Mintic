package com.example.ProyectoMintic.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TaskController {

    @GetMapping("/tarea")
    public String Hello(){return "<h1> Esto es una prueba es un endpoint </h1>";}
}
