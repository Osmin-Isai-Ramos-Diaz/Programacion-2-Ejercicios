/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x20;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class AreaDeCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = circuloArea(radio);

        System.out.printf("El área del círculo es: %.2f%n", area);

        scanner.close();
    }

    public static double circuloArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
}