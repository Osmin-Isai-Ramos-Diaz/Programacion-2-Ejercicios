/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2._17;

/**
 *
 * @author osmin
 */
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        try {
            // Lanzamos una excepción de tipo ExcepcionA
            throw new ExcepcionA("ExcepcionA lanzada");
        } catch (Exception excepcion) {
            // Atrapamos excepciones de tipo ExcepcionA y sus subclases
            System.out.println("Excepción atrapada: " + excepcion.getMessage());
        }

        try {
            // Lanzamos una excepción de tipo ExcepcionB
            throw new ExcepcionB("ExcepcionB lanzada");
        } catch (Exception excepcion) {
            // Atrapamos excepciones de tipo ExcepcionB y sus subclases
            System.out.println("Excepción atrapada: " + excepcion.getMessage());
        }

        try {
            // Lanzamos una excepción NullPointerException
            throw new NullPointerException("NullPointerException lanzada");
        } catch (Exception excepcion) {
            // Atrapamos excepciones de tipo Exception (incluye NullPointerException)
            System.out.println("Excepción atrapada: " + excepcion.getMessage());
        }

        try {
            // Lanzamos una excepción IOException
            throw new IOException("IOException lanzada");
        } catch (Exception excepcion) {
            // Atrapamos excepciones de tipo Exception (incluye IOException)
            System.out.println("Excepción atrapada: " + excepcion.getMessage());
        }
    }
}
