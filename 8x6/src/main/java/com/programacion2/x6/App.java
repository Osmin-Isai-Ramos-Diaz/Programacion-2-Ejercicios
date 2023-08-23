/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x6;

/**
 *
 * @author osmin
 */
public class App {

    public static void main(String[] args) {
        CuentaDeAhorros.modificarTasaInteres(0.04);

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        for (int mes = 1; mes <= 12; mes++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();

            System.out.println("Mes " + mes);
            System.out.println("Saldo de ahorrador1: $" + ahorrador1.getSaldoAhorros());
            System.out.println("Saldo de ahorrador2: $" + ahorrador2.getSaldoAhorros());
        }

        CuentaDeAhorros.modificarTasaInteres(0.05);

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();

        System.out.println("Mes 13");
        System.out.println("Saldo de ahorrador1: $" + ahorrador1.getSaldoAhorros());
        System.out.println("Saldo de ahorrador2: $" + ahorrador2.getSaldoAhorros());
    }
}
