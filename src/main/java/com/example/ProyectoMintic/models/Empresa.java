package com.example.ProyectoMintic.models;

import java.time.LocalDate;

public class Empresa {
    private String nombre;
    private String direccion;
    private String telefono;
    private LocalDate nit;

    public Empresa(String nombre, String direccion, String telefono, LocalDate nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
}
