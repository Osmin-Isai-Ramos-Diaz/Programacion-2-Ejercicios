/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x15;

/**
 *
 * @author osmin
 */
public class TrianguloPatrones {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // Espacio entre patrones

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // Espacio entre patrones

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 10; j >= i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }

        System.out.println(); // Espacio entre patrones

        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j <= 10 - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}