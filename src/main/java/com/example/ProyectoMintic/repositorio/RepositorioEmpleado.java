package com.example.ProyectoMintic.repositorio;

import com.example.ProyectoMintic.models.empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RepositorioEmpleado extends JpaRepository <empleado, String> {

}
