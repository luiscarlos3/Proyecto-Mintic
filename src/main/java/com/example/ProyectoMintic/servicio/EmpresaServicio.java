package com.example.ProyectoMintic.servicio;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProyectoMintic.repositorio.RepositorioEmpresa;
import com.example.ProyectoMintic.models.empresa;

import java.util.List;

@Service
public class EmpresaServicio {

    @Autowired
    private RepositorioEmpresa repositorio;

    public List<empresa> listarEmpresa(){
        return repositorio.findAll();
    }

    public void guardarEmpresa(empresa Entidad){
        repositorio.save(Entidad);
    }

    public empresa obtenerEmpresaPorCodigo(String Codigo){
        return repositorio.findById(Codigo).get();
    }

    public void eliminarEmpresa(String Codigo)
    {
        repositorio.deleteById(Codigo);
    }

}

