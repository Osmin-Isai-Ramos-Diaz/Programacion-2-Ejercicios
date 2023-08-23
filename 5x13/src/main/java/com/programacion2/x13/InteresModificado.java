/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x13;

/**
 *
 * @author osmin
 */
public class InteresModificado {
    public static void main(String[] args) {
        double monto;
        double principal = 1000.0;
        
        System.out.println("Tasa de Interés\tAño\tMonto en Depósito");

        for (double tasa = 0.05; tasa <= 0.10; tasa += 0.01) {
            System.out.printf("%.2f\t\t", tasa * 100);

            for (int anio = 1; anio <= 10; ++anio) {
                monto = principal * Math.pow(1.0 + tasa, anio);
                System.out.printf("%d\t$%,.2f%n", anio, monto);
            }
        }
    }
}
