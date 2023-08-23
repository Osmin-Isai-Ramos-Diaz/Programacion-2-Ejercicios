/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x32;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class DistanciaEntrePuntos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = scanner.nextDouble();

        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = scanner.nextDouble();

        double distancia = distancia(x1, y1, x2, y2);

        System.out.printf("La distancia entre los puntos es: %.2f%n", distancia);

        scanner.close();
    }

    public static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
