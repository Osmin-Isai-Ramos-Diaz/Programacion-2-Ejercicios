/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x24;

/**
 *
 * @author osmin
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero;
        
        System.out.print("Escriba el primer entero: ");
        numero = entrada.nextInt();
        
        int mayor = numero;
        int menor = numero;
        
        for (int i = 2; i <= 5; i++) {
            System.out.printf("Escriba el %dº entero: ", i);
            numero = entrada.nextInt();
            
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.printf("El entero mayor es %d%n", mayor);
        System.out.printf("El entero menor es %d%n", menor);
        
        entrada.close();
    }
}
