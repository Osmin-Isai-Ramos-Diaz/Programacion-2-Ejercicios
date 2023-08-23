/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.ejercicio1016;

/**
 *
 * @author osmin
 */
class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
                                   String numeroSeguroSocial, double ventasBrutas,
                                   double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial,
                ventasBrutas, tarifaComision);

        if (salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");

        this.salarioBase = salarioBase;
    }

    public void establecerSalarioBase(double salarioBase) {
        if (salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");

        this.salarioBase = salarioBase;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerSalarioBase() + super.obtenerMontoPago();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "con salario base", super.toString(),
                "salario base", obtenerSalarioBase());
    }
}
