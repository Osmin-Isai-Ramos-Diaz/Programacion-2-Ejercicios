/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.xx11;

/**
 *
 * @author osmin
 */
public class App {

public static void main(String[] args) {
        Complejo complejo1 = new Complejo(3.0, 4.0);
        Complejo complejo2 = new Complejo(1.5, 2.5);
        
        System.out.print("Complejo 1: ");
        complejo1.imprimir();
        
        System.out.print("Complejo 2: ");
        complejo2.imprimir();
        
        Complejo suma = complejo1.sumar(complejo2);
        System.out.print("Suma: ");
        suma.imprimir();
        
        Complejo resta = complejo1.restar(complejo2);
        System.out.print("Resta: ");
        resta.imprimir();
    }
}
