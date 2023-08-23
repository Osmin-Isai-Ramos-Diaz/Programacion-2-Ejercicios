/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x23;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class MinimoEntreTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Escribe el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escribe el tercer número: ");
        double num3 = scanner.nextDouble();

        double minimo = minimo3(num1, num2, num3);

        System.out.printf("El valor mínimo entre %.2f, %.2f y %.2f es %.2f%n", num1, num2, num3, minimo);

        scanner.close();
    }

    public static double minimo3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }
}