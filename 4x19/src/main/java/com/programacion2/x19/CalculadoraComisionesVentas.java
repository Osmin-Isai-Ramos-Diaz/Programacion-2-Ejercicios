/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x19;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class CalculadoraComisionesVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double salarioBase = 200.0;
        double porcentajeComision = 0.09;
        
        double totalVentas = 0.0;
        
        System.out.println("Calculadora de Comisiones de Ventas");
        System.out.println("Ingrese las ventas de cada vendedor (-1 para salir).");
        
        int contadorVendedores = 0;
        
        while (true) {
            System.out.print("Ventas del vendedor " + (contadorVendedores + 1) + " (-1 para terminar): ");
            double ventas = scanner.nextDouble();
            
            if (ventas == -1) {
                break;
            }
            
            double comision = salarioBase + (ventas * porcentajeComision);
            System.out.printf("La comisión para el vendedor %d es: $%.2f%n", contadorVendedores + 1, comision);
            
            totalVentas += ventas;
            contadorVendedores++;
        }
        
        System.out.println("Resumen:");
        System.out.printf("Número total de vendedores: %d%n", contadorVendedores);
        System.out.printf("Total de ventas: $%.2f%n", totalVentas);
        
        scanner.close();
    }
}
