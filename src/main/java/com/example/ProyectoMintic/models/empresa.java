package com.example.ProyectoMintic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class empresa {
    @Id
    private String codigo;
    @Column
    private String nombre_empresa;
    @Column
    private String direccion;
    @Column
    private String telefono;
    @Column
    private LocalDate nit;
    @Column
    private String empresa_empleado;
    public empresa(){


    }

    public empresa(String codigo, String nombre_empresa, String direccion, String telefono, LocalDate nit, String empresa_empleado) {
        this.codigo = codigo;
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
        this.empresa_empleado = empresa_empleado;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getNit() {
        return nit;
    }

    public void setNit(LocalDate nit) {
        this.nit = nit;
    }

    public String getEmpresa_empleado() {
        return empresa_empleado;
    }

    public void setEmpresa_empleado(String empresa_empleado) {
        this.empresa_empleado = empresa_empleado;
    }
}
