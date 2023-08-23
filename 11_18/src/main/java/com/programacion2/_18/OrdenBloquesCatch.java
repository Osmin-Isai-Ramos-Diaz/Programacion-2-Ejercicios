/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2._18;

/**
 *
 * @author osmin
 */
public class OrdenBloquesCatch {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[4]); // Intentamos acceder a un índice fuera del rango
        } catch (Exception e) {
            System.out.println("Excepción general: " + e.getMessage());
        }
    }
}

