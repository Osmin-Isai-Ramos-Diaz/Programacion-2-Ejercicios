/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2._21;

/**
 *
 * @author osmin
 */
public class Main {

    public static void main(String[] args) {
        try {
            metodo2();
        } catch (Exception e) {
            System.out.println("Excepción capturada en el método main:");
            e.printStackTrace();
        }
    }

    public static void metodo2() throws Exception {
        metodo1();
    }

    public static void metodo1() throws Exception {
        try {
            // Aquí lanzamos una excepción que no es atrapada dentro del bloque try-catch
            throw new Exception("Excepción lanzada desde el método metodo1");
        } catch (NullPointerException e) {
            // No se captura la excepción NullPointerException aquí
            System.out.println("NullPointerException capturada en el método metodo1");
        }
    }
}