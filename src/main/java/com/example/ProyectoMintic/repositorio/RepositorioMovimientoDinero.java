package com.example.ProyectoMintic.repositorio;

import com.example.ProyectoMintic.models.Movimiento_dinero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMovimientoDinero extends JpaRepository<Movimiento_dinero, Integer> {
}
