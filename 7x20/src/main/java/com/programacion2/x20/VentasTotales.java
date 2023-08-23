/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x20;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class VentasTotales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] ventas = new double[5][6]; // Filas: productos (1-5), Columnas: vendedores (1-4) + Total

        System.out.println("Ingrese las ventas del mes pasado:");

        for (int producto = 1; producto <= 5; producto++) {
            System.out.println("Producto " + producto + ":");
            for (int vendedor = 1; vendedor <= 4; vendedor++) {
                System.out.print("Vendedor " + vendedor + ": $");
                ventas[producto - 1][vendedor - 1] = scanner.nextDouble();
                ventas[producto - 1][5] += ventas[producto - 1][vendedor - 1]; // Sumar al total del producto
                ventas[4][vendedor - 1] += ventas[producto - 1][vendedor - 1]; // Sumar al total del vendedor
            }
        }

        System.out.println("\nResumen de ventas totales:");
        System.out.print("Producto / Vendedor\t");
        for (int vendedor = 1; vendedor <= 4; vendedor++) {
            System.out.print("Vendedor " + vendedor + "\t");
        }
        System.out.println("Total");

        for (int producto = 1; producto <= 5; producto++) {
            System.out.print("Producto " + producto + "\t\t\t");
            for (int vendedor = 1; vendedor <= 4; vendedor++) {
                System.out.printf("$%.2f\t\t", ventas[producto - 1][vendedor - 1]);
            }
            System.out.printf("$%.2f\n", ventas[producto - 1][5]);
        }

        System.out.print("Total\t\t\t\t");
        for (int vendedor = 1; vendedor <= 4; vendedor++) {
            System.out.printf("$%.2f\t\t", ventas[4][vendedor - 1]);
        }
        System.out.printf("$%.2f\n", ventas[4][5]);
    }
}