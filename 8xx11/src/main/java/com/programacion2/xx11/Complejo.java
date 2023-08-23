/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.xx11;

/**
 *
 * @author osmin
 */
public class Complejo {
    private double parteReal;
    private double parteImaginaria;
    
    // Constructor con valores iniciales
    public Complejo(double parteReal, double parteImaginaria) {
        this.parteReal = parteReal;
        this.parteImaginaria = parteImaginaria;
    }
    
    // Constructor sin argumentos (valores predeterminados)
    public Complejo() {
        this(0.0, 0.0);
    }
    
    // Método para sumar dos números complejos
    public Complejo sumar(Complejo otro) {
        double nuevaParteReal = parteReal + otro.parteReal;
        double nuevaParteImaginaria = parteImaginaria + otro.parteImaginaria;
        return new Complejo(nuevaParteReal, nuevaParteImaginaria);
    }
    
    // Método para restar dos números complejos
    public Complejo restar(Complejo otro) {
        double nuevaParteReal = parteReal - otro.parteReal;
        double nuevaParteImaginaria = parteImaginaria - otro.parteImaginaria;
        return new Complejo(nuevaParteReal, nuevaParteImaginaria);
    }
    
    // Método para imprimir el número complejo
    public void imprimir() {
        System.out.printf("(%f, %f)%n", parteReal, parteImaginaria);
    }   
}
