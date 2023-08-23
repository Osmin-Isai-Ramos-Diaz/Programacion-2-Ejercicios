/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion2._18;

/**
 *
 * @author osmin
 */
public class OrdenBloquesCatch2 {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[4]); // Intentamos acceder a un índice fuera del rango
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción de índice fuera de rango: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Excepción general: " + e.getMessage());
        }
    }
}
