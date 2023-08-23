/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x17;

/**
 *
 * @author osmin
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;
        
        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();
        
        if (numero1 > numero2) {
            System.out.printf("%d es más grande%n", numero1);
        } else if (numero2 > numero1) {
            System.out.printf("%d es más grande%n", numero2);
        } else {
            System.out.println("Estos números son iguales");
        }
        
        entrada.close();
    }
}