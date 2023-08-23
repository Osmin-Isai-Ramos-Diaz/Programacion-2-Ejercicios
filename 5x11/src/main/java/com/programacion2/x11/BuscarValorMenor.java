/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x11;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class BuscarValorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de valores a comparar: ");
        int cantidadValores = scanner.nextInt();

        if (cantidadValores <= 0) {
            System.out.println("Debe ingresar al menos un valor.");
            scanner.close();
            return;
        }

        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= cantidadValores; i++) {
            System.out.print("Ingrese el valor #" + i + ": ");
            int valor = scanner.nextInt();

            if (valor < menor) {
                menor = valor;
            }
        }

        System.out.println("El valor menor es: " + menor);
        scanner.close();
    }
}
