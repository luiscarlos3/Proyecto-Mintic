package com.example.ProyectoMintic.servicio;

import com.example.ProyectoMintic.models.Movimiento_dinero;
import com.example.ProyectoMintic.repositorio.RepositorioMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MovimientoServicio {

    @Autowired
    private RepositorioMovimientoDinero repositorio;

    public List<Movimiento_dinero> listarMovimiento(){
        return repositorio.findAll();
    }

    public void guardarMovimiento(Movimiento_dinero movimiento){
        repositorio.save(movimiento);
    }

    public Movimiento_dinero obtenerMovimientoPorid(int Codigo){
        return repositorio.findById(Codigo).get();
    }

    public void eliminarmMovimiento(int Codigo)
    {
        repositorio.deleteById(Codigo);
    }
}
