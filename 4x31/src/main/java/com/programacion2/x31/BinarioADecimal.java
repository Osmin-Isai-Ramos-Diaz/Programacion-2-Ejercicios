/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x31;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class BinarioADecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número binario: ");
        String binarioStr = scanner.nextLine();

        int decimal = 0;
        int longitud = binarioStr.length();

        for (int i = 0; i < longitud; i++) {
            char digito = binarioStr.charAt(i);
            int valorDigito = Character.getNumericValue(digito);

            if (valorDigito != 0 && valorDigito != 1) {
                System.out.println("El número ingresado no es binario.");
                return;
            }

            int potencia = longitud - i - 1;
            decimal += valorDigito * Math.pow(2, potencia);
        }

        System.out.println("El equivalente decimal de " + binarioStr + " es: " + decimal);
        scanner.close();
    }
}
