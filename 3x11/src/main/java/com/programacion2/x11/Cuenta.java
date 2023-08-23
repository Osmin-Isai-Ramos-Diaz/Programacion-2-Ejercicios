/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.x11;

/**
 *
 * @author osmin1
 */
public class Cuenta {
    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        
        if (saldo > 0.0) {
            this.saldo = saldo;
        }
    }

    public void depositar(double montoDeposito) {
        if (montoDeposito > 0.0) {
            saldo += montoDeposito;
        }
    }

    public void retirar(double montoRetiro) {
        if (montoRetiro <= saldo) {
            saldo -= montoRetiro;
        } else {
            System.out.println("El monto a retirar excede el saldo de la cuenta.");
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
