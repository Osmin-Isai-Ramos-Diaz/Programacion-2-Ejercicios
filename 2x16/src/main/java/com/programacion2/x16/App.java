/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x16;

/**
 *
 * @author osmin
 */
import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3;
        
        System.out.print("Escriba el primer entero: ");
        numero1 = entrada.nextInt();
        
        System.out.print("Escriba el segundo entero: ");
        numero2 = entrada.nextInt();
        
        System.out.print("Escriba el tercer entero: ");
        numero3 = entrada.nextInt();
        
        int suma = numero1 + numero2 + numero3;
        int promedio = suma / 3;
        int producto = numero1 * numero2 * numero3;
        
        int menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }
        
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        
        System.out.printf("Suma: %d%n", suma);
        System.out.printf("Promedio: %d%n", promedio);
        System.out.printf("Producto: %d%n", producto);
        System.out.printf("Menor: %d%n", menor);
        System.out.printf("Mayor: %d%n", mayor);
        
        entrada.close();
    }
}