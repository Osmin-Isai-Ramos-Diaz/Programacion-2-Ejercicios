/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x8;

/**
 *
 * @author osmin
 */
public class PruebaFecha {
    public static void main(String[] args) {
        Fecha fecha = new Fecha(12, 31, 2022); // Ejemplo de fecha inicial
        System.out.println("Fecha inicial: " + fecha);
        
        // Prueba de adelantar día
        for (int i = 1; i <= 35; i++) {
            fecha.siguienteDia();
            System.out.println("Siguiente día (" + i + "): " + fecha);
        }
    }
}