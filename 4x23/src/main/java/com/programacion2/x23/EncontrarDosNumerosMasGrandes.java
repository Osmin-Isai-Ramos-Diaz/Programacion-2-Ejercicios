/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x23;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class EncontrarDosNumerosMasGrandes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int primerMayor = 0;
        int segundoMayor = 0;

        while (contador <= 10) {
            System.out.print("Ingrese el número " + contador + ": ");
            int numero = scanner.nextInt();

            if (contador == 1) {
                primerMayor = numero;
            } else if (contador == 2) {
                if (numero > primerMayor) {
                    segundoMayor = primerMayor;
                    primerMayor = numero;
                } else {
                    segundoMayor = numero;
                }
            } else {
                if (numero > primerMayor) {
                    segundoMayor = primerMayor;
                    primerMayor = numero;
                } else if (numero > segundoMayor) {
                    segundoMayor = numero;
                }
            }

            contador++;
        }

        System.out.println("Los dos números más grandes son: " + primerMayor + " y " + segundoMayor);
        scanner.close();
    }
}
