/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x28;

/**
 *
 * @author osmin
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba el radio del círculo: ");
        int radio = entrada.nextInt();
        
        System.out.printf("Diámetro: %.2f%n", 2.0 * radio);
        System.out.printf("Circunferencia: %.2f%n", 2.0 * Math.PI * radio);
        System.out.printf("Área: %.2f%n", Math.PI * radio * radio);
        
        entrada.close();
    }
}
