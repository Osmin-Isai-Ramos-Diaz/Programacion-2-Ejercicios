/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x18;

/**
 *
 * @author osmin
 */
public class CuadradoDeAsteriscos {
    public static void main(String[] args) {
        cuadradoDeAsteriscos(4); 
    }

    public static void cuadradoDeAsteriscos(int lado) {
        for (int fila = 1; fila <= lado; fila++) {
            for (int columna = 1; columna <= lado; columna++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}