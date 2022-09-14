package com.example.ProyectoMintic.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProyectoMintic.repositorio.RepositorioEmpleado;
import com.example.ProyectoMintic.models.empleado;

import java.util.List;

@Service
public class EmpleadoServicio {
    @Autowired
    private RepositorioEmpleado repositorio;

    public List<empleado> listarEmpleado(){
        return repositorio.findAll();
    }

    public void guardarEmpleado(empleado Empleado){
        repositorio.save(Empleado);
    }

    public empleado obtenerEmpleadoPorIdentificacion(String Identificacion){
        return repositorio.findById(Identificacion).get();
    }

    public void eliminarEmpleado(String Identificacion)
    {
        repositorio.deleteById(Identificacion);
    }

}
