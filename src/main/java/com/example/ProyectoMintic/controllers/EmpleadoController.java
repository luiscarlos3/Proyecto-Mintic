package com.example.ProyectoMintic.controllers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import com.example.ProyectoMintic.services.ServicesEmpleado;
import com.example.ProyectoMintic.models.Empleado;

import javax.swing.text.html.parser.Entity;
import java.util.*;

@RestController
@RequestMapping("personas")
public class EmpleadoController {
    @Autowired
    private ServicesEmpleado empleadoServices;

    @PostMapping("/Guardar")

    public void guardar(@RequestBody Empleado persona) {
        empleadoServices.save(persona);
    }
    @GetMapping("/listar")
    public List<Empleado>Listar(){
        return empleadoServices.findAll();
    }
    @DeleteMapping("/eliminar/{identificacion}")
    public void Eliminar(@PathVariable("identificacion") String identificacion){
        empleadoServices.deleteById(identificacion);
    }
    @PutMapping("actualizar")
    public void actualizar(@RequestBody Empleado empleado){
        empleadoServices.save(empleado);


    }

}