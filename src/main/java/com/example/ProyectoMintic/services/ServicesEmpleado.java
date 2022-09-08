package com.example.ProyectoMintic.services;

import com.example.ProyectoMintic.models.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ServicesEmpleado extends JpaRepository <Empleado, String> {

}
