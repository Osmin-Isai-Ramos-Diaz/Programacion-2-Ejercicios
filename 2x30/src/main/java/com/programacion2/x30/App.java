/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x30;

/**
 *
 * @author osmin
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba un número de cinco dígitos: ");
        int numero = entrada.nextInt();
        
        int digito5 = numero % 10;
        numero /= 10;
        
        int digito4 = numero % 10;
        numero /= 10;
        
        int digito3 = numero % 10;
        numero /= 10;
        
        int digito2 = numero % 10;
        numero /= 10;
        
        int digito1 = numero % 10;
        
        System.out.printf("%d   %d   %d   %d   %d%n", digito1, digito2, digito3, digito4, digito5);
        
        entrada.close();
    }
}
