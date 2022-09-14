package com.example.ProyectoMintic.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.ProyectoMintic.models.empresa;
import com.example.ProyectoMintic.servicio.EmpresaServicio;
import java.util.*;
@RestController
@RequestMapping("empresa")
public class EmpresaController {
    @Autowired
    private EmpresaServicio EmpresaServicio;


    @PostMapping("/Guardar")
    public void guardar(@RequestBody empresa Entidad){
        ArrayList<empresa> exe = new ArrayList<empresa>();
        exe.add(Entidad);
        System.out.println("\n\n");
        System.out.println("Estamos aca : " + Entidad.getCodigo());
        for (empresa item : exe) {
            System.out.println(item.getCodigo());
            System.out.println(item.getNit());
            System.out.println(item.getEmpresa_empleado());
        }
        System.out.println("\n\n");

        EmpresaServicio.guardarEmpresa(Entidad);

    }

    @GetMapping("/listar")
    public List<empresa>Listar(){
        return EmpresaServicio.listarEmpresa();
    }

    @GetMapping("entidad/{codigo}")
    public ResponseEntity<empresa> obtenerempleado(@PathVariable String codigo){
        try {
            empresa entidad = EmpresaServicio.obtenerEmpresaPorCodigo(codigo);
            return new ResponseEntity<empresa>(entidad, HttpStatus.OK);

        }catch (Exception e){
            return new ResponseEntity<empresa>(HttpStatus.NOT_FOUND);

        }


    }
    @DeleteMapping("/eliminar/{codigo}")
    public void Eliminar(@PathVariable String codigo){
        EmpresaServicio.eliminarEmpresa(codigo);
    }
    @PutMapping("/actualizar/{codigo}")
    public ResponseEntity<?> actualizarEmpresa(@RequestBody empresa Entidad, @PathVariable String codigo){
        try {
            com.example.ProyectoMintic.models.empresa empresaActual = EmpresaServicio.obtenerEmpresaPorCodigo(codigo);
            empresaActual.setCodigo(Entidad.getCodigo());
            empresaActual.setNombre_empresa(Entidad.getNombre_empresa());
            return new ResponseEntity<empresa>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<empresa>(HttpStatus.NOT_FOUND);



        }


    }


}
