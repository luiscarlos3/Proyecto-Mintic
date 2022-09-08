package com.example.ProyectoMintic.controllers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ProyectoMintic.services.ServicesEmpleado;
import com.example.ProyectoMintic.models.Empleado;

@RestController
@RequestMapping("personas")
public class EmpleadoController {
    @Autowired
    private ServicesEmpleado empleadoServices;
    @PostMapping("/Guardar")

    public  void guardar(@RequestBody Empleado persona){
        empleadoServices.save(persona);




    }



}
