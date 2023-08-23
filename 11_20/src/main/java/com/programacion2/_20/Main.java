/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2._20;

/**
 *
 * @author osmin
 */
public class Main {

    public static void main(String[] args) {
        try {
            unMetodo();
        } catch (Exception e) {
            System.out.println("Excepción capturada en el método main:");
            e.printStackTrace();
        }
    }

    public static void unMetodo() throws Exception {
        try {
            unMetodo2();
        } catch (Exception e) {
            System.out.println("Excepción capturada en el método unMetodo:");
            throw e; // Volvemos a lanzar la excepción
        }
    }

    public static void unMetodo2() throws Exception {
        throw new Exception("Excepción lanzada desde el método unMetodo2");
    }
}