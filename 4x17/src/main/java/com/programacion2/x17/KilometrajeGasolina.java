/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x17;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class KilometrajeGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalKilometros = 0;
        int totalLitros = 0;

        System.out.println("Calculadora de Kilómetros por Litro");
        System.out.println("Ingrese los datos de cada viaje (kilómetros y litros) o -1 para salir.");

        int kilometros;
        int litros;
        int contadorViajes = 0;

        while (true) {
            System.out.print("Kilómetros recorridos en el viaje (o -1 para salir): ");
            kilometros = scanner.nextInt();

            if (kilometros == -1) {
                break;
            }

            System.out.print("Litros de gasolina usados en el viaje: ");
            litros = scanner.nextInt();

            if (litros == -1) {
                break;
            }

            double kilometrosPorLitro = (double) kilometros / litros;
            System.out.printf("Kilómetros por litro en este viaje: %.2f%n", kilometrosPorLitro);

            totalKilometros += kilometros;
            totalLitros += litros;
            contadorViajes++;

            double promedioKilometrosPorLitro = (double) totalKilometros / totalLitros;
            System.out.printf("Promedio de kilómetros por litro en %d viaje(s): %.2f%n%n", contadorViajes, promedioKilometrosPorLitro);
        }

        System.out.println("¡Hasta luego!");
        scanner.close();
    }
}