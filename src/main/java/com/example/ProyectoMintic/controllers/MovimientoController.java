package com.example.ProyectoMintic.controllers;

import com.example.ProyectoMintic.servicio.MovimientoServicio;
import com.example.ProyectoMintic.models.Movimiento_dinero;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@RestController
@RequestMapping("movimiento")

public class MovimientoController {
    @Autowired
    private MovimientoServicio movimientoServicio;

    @PostMapping("/Guardar")
    public void guardar(@RequestBody Movimiento_dinero movimiento) {
        ArrayList<Movimiento_dinero> exe = new ArrayList<Movimiento_dinero>();
        exe.add(movimiento);
        System.out.println("\n\n");
        //persona.setEmpleado_rol(2);
        System.out.println("Estamos aca : " + movimiento.getId_movimiento());
        for ( Movimiento_dinero item : exe) {
            System.out.println(item.getId_movimiento());

        }
        System.out.println("\n\n");

        movimientoServicio.guardarMovimiento(movimiento);
    }


    @GetMapping("/listar")
    public List<Movimiento_dinero> Listar(){
        return movimientoServicio.listarMovimiento();
    }

    @GetMapping("/transaccion/{codigo}")
    public ResponseEntity<Movimiento_dinero> obtenerMovimientos(@PathVariable int codigo){
        try {
            Movimiento_dinero Transaccion = movimientoServicio.obtenerMovimientoPorid(codigo);
            return new ResponseEntity<Movimiento_dinero>(Transaccion, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<Movimiento_dinero>(HttpStatus.NOT_FOUND);

        }
    }

    @DeleteMapping("/eliminar/{codigo}")
    public void Eliminar(@PathVariable int codigo){movimientoServicio.eliminarmMovimiento(codigo);
    }
    @PutMapping("/actualizar/{codigo}")
    public ResponseEntity<?> actualizarMovimiento(@RequestBody Movimiento_dinero Transacion, @PathVariable int codigo){
        try {
            Movimiento_dinero transacion = movimientoServicio.obtenerMovimientoPorid(codigo);
            //transacion.setId_movimiento(transacion.getId_movimiento());
            transacion.setConcepto(transacion.getConcepto());
            movimientoServicio.guardarMovimiento(Transacion);
            return new ResponseEntity<Movimiento_dinero>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<Movimiento_dinero>(HttpStatus.NOT_FOUND);



        }
    }







}
