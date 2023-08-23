/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x21;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class EncontrarNumeroMasGrande {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int mayor = 0;

        while (contador <= 10) {
            System.out.print("Ingrese el número " + contador + ": ");
            int numero = scanner.nextInt();

            if (contador == 1) {
                mayor = numero;
            } else {
                if (numero > mayor) {
                    mayor = numero;
                }
            }

            contador++;
        }

        System.out.println("El número más grande es: " + mayor);
        scanner.close();
    }
}
