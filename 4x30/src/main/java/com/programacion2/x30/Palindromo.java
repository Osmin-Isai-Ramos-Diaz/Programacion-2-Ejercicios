/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x30;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = 0;

        while (true) {
            System.out.print("Ingrese un número de cinco dígitos: ");
            numero = scanner.nextInt();

            if (numero >= 10000 && numero <= 99999) {
                break;
            } else {
                System.out.println("El número debe tener cinco dígitos.");
            }
        }

        int digito1 = numero / 10000;
        int digito2 = (numero / 1000) % 10;
        int digito4 = (numero / 10) % 10;
        int digito5 = numero % 10;

        if (digito1 == digito5 && digito2 == digito4) {
            System.out.println("El número " + numero + " es un palíndromo.");
        } else {
            System.out.println("El número " + numero + " no es un palíndromo.");
        }

        scanner.close();
    }
}
