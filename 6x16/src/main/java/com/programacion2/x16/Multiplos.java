/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x16;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese pares de números (0 para finalizar):");
        
        int numero1, numero2;
        
        do {
            System.out.print("Ingrese el primer número: ");
            numero1 = scanner.nextInt();
            
            if (numero1 != 0) {
                System.out.print("Ingrese el segundo número: ");
                numero2 = scanner.nextInt();
                
                if (esMultiplo(numero1, numero2)) {
                    System.out.println(numero2 + " es múltiplo de " + numero1);
                } else {
                    System.out.println(numero2 + " no es múltiplo de " + numero1);
                }
            }
        } while (numero1 != 0);
        
        scanner.close();
    }

    public static boolean esMultiplo(int numero1, int numero2) {
        return numero2 % numero1 == 0;
    }
}




