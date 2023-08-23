/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x15;

/**
 *
 * @author osmin
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;
        
        System.out.print("Escriba el primer número: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Escriba el segundo número: ");
        numero2 = entrada.nextInt();
        
        int suma = numero1 + numero2;
        int producto = numero1 * numero2;
        int diferencia = numero1 - numero2;
        
        if (numero2 != 0) {
            double cociente = (double) numero1 / numero2;
            
            System.out.printf("Suma: %d%n", suma);
            System.out.printf("Producto: %d%n", producto);
            System.out.printf("Diferencia: %d%n", diferencia);
            System.out.printf("Cociente: %.2f%n", cociente);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        
        entrada.close();
    }
}
