/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.lineadecomandos;

/**
 *
 * @author osmin
 */
import java.util.Scanner;
public class LineaDeComandos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Arreglo[];
        int numero=10;
        
        System.out.println("\nIntroduzca la dimencion del arreglo");
        numero = entrada.nextInt();
        
        Arreglo = new int[numero];
        System.out.printf("%s%8s\n", "Indice","Valor");
        
        for(int cont = 0; cont < Arreglo.length;cont++){
            System.out.printf("%5d%8d\n", cont,Arreglo[cont]);
        }
    }
}
