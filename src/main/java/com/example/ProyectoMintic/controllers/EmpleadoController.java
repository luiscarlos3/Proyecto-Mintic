package com.example.ProyectoMintic.controllers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ProyectoMintic.models.empleado;
import com.example.ProyectoMintic.servicio.EmpleadoServicio;

import java.lang.reflect.Array;
import java.util.*;

@RestController
@RequestMapping("personas")
public class EmpleadoController {
    @Autowired
    private EmpleadoServicio empleadoServices;

    @PostMapping("/Guardar")
    public void guardar(@RequestBody empleado persona) {
        ArrayList<empleado> exe = new ArrayList<empleado>();
        exe.add(persona);
        System.out.println("\n\n");
        //persona.setEmpleado_rol(2);
        System.out.println("Estamos aca : " + persona.getEmpleado_rol());
        for ( empleado item : exe) {
            System.out.println(item.getIdentificacion());
            System.out.println(item.getNombre());
            System.out.println(item.getEmpresa());
            System.out.println(item.getCorreo());
            System.out.println(item.getEmpleado_rol());

        }
        System.out.println("\n\n");

        empleadoServices.guardarEmpleado(persona);
    }
    @GetMapping("/listar")
    public List<empleado>Listar(){
        return empleadoServices.listarEmpleado();
    }
    @GetMapping("Empleado/{identificacion}")
    public ResponseEntity<empleado>obtenerempleado(@PathVariable String iddentificacion){
        try {
            empleado persona = empleadoServices.obtenerEmpleadoPorIdentificacion(iddentificacion);
            return new ResponseEntity<empleado>(persona, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<empleado>(HttpStatus.NOT_FOUND);

        }


    }
    @DeleteMapping("/eliminar/{identificacion}")
    public void Eliminar(@PathVariable String identificacion){
        empleadoServices.eliminarEmpleado(identificacion);
    }
    @PutMapping("/actualizar/{identificacion}")
    public ResponseEntity<?> actualizarEmpleado(@RequestBody empleado Empleado, @PathVariable String identificacion){
        try {
            com.example.ProyectoMintic.models.empleado empleadoActual = empleadoServices.obtenerEmpleadoPorIdentificacion(identificacion);
            empleadoActual.setNombre(Empleado.getNombre());
            empleadoActual.setEmpresa(Empleado.getEmpresa());
            empleadoServices.guardarEmpleado(empleadoActual);
            return new ResponseEntity<empleado>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<empleado>(HttpStatus.NOT_FOUND);



        }
    }


///https://blog.codmind.com/mi-primer-api-rest-con-spring-boot/
}