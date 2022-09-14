package com.example.ProyectoMintic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class empleado {
    @Id
    private String identificacion;
    @Column
    private String nombre;
    @Column
    private String correo;
    @Column
    private String empresa;

    @Column
    private int empleado_rol;

public empleado(){

}
    public empleado(String identificacion , String nombre, String correo, String empresa, int empleado_rol) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.empleado_rol = empleado_rol;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public int getEmpleado_rol() {
        return empleado_rol;
    }

    public void setEmpleado_rol(int empleado_rol) {
        this.empleado_rol = empleado_rol;
    }


}
