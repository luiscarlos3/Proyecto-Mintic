package com.example.ProyectoMintic.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
@Entity
public class Movimiento_dinero {
    @Id
    private int id_movimiento;
    @Column
    private double monto;
    @Column
    private String concepto;
    @Column
    private String movimiento_empleado;
    @Column
    private String movimiento_empresa;
    public Movimiento_dinero(){


    }

    public Movimiento_dinero(int id_movimiento, double monto, String concepto, String  movimiento_empleado, String movimiento_empresa) {
        this.id_movimiento = id_movimiento;
        this.monto = monto;
        this.concepto = concepto;
        this.movimiento_empleado = movimiento_empleado;
        this.movimiento_empresa = movimiento_empresa;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public String getMovimiento_empleado() {
        return movimiento_empleado;
    }

    public void setMovimiento_empleado(String movimiento_empleado) {
        this.movimiento_empleado = movimiento_empleado;
    }

    public String getMovimiento_empresa() {
        return movimiento_empresa;
    }

    public void setMovimiento_empresa(String movimiento_empresa) {
        this.movimiento_empresa = movimiento_empresa;
    }
}

