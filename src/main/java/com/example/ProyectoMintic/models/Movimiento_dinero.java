package com.example.ProyectoMintic.models;

import java.time.LocalDate;

public class Movimiento_dinero {

    private double monto;
    private String concepto;
    private String usuarioMovimiento;

    public Movimiento_dinero(double monto, String concepto, String usuarioMovimiento) {
        this.monto = monto;
        this.concepto = concepto;
        this.usuarioMovimiento = usuarioMovimiento;
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

    public String getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(String usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }
}
