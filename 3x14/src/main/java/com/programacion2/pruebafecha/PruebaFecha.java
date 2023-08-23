/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.pruebafecha;

/**
 *
 * @author osmin1
 */
import java.util.Scanner;
public class PruebaFecha {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Fecha definicion = new Fecha();
        
        System.out.println("Escriba el dia: ");
        int dia = entrada.nextInt();
        definicion.setDia(dia);
        
        System.out.println("Escriba el mes: ");
        int mes = entrada.nextInt();
        definicion.setMes(mes);
        
        System.out.println("Escriba el anno");
        int year = entrada.nextInt();
        definicion.setYear(year);
        


         System.out.println("_____________________________________________________");
         System.out.println("La fecha es: "+ dia +"/" + mes +"/"+ year);
         System.out.println("_____________________________________________________");
}
}
