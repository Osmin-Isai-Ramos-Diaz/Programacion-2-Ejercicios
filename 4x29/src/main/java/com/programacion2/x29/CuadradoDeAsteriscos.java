/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x29;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class CuadradoDeAsteriscos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del lado del cuadrado (entre 1 y 20): ");
        int lado = scanner.nextInt();

        if (lado >= 1 && lado <= 20) {
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) {
                    if (i == 1 || i == lado || j == 1 || j == lado) {
                        System.out.print("█");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Tamaño del lado fuera del rango válido.");
        }

        scanner.close();
    }
}