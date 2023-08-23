/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.ejercicio1016;

/**
 *
 * @author osmin
 */

interface PorPagar {
    double obtenerMontoPago();
}
abstract class Empleado implements PorPagar {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public String obtenerNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    @Override
    public String toString() {
        return String.format("%s %s%nnumero de seguro social: %s",
                obtenerPrimerNombre(), obtenerApellidoPaterno(),
                obtenerNumeroSeguroSocial());
    }
}