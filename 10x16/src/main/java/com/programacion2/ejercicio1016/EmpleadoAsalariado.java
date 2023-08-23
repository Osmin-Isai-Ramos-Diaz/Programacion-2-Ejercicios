/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.ejercicio1016;

/**
 *
 * @author osmin
 */
class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,
                              String numeroSeguroSocial, double salarioSemanal) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);

        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");

        this.salarioSemanal = salarioSemanal;
    }

    public void establecerSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException("El salario semanal debe ser >= 0.0");

        this.salarioSemanal = salarioSemanal;
    }

    public double obtenerSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public double obtenerMontoPago() {
        return obtenerSalarioSemanal();
    }

    @Override
    public String toString() {
        return String.format("empleado asalariado: %s%n%s: $%,.2f",
                super.toString(), "salario semanal", obtenerSalarioSemanal());
    }
}