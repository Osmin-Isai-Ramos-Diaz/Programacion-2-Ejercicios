/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2._16;

/**
 *
 * @author osmin
 */
public class DemoExcepciones {
    public static void main(String[] args) {
        try {
            // Lanzamos una excepción ExcepcionC
            throw new ExcepcionC("ExcepcionC lanzada");
        } catch (ExcepcionA excepcion) {
            // Atrapamos excepciones de tipo ExcepcionA, ExcepcionB y ExcepcionC
            System.out.println("Excepción atrapada: " + excepcion.getMessage());
        }
    }
}
