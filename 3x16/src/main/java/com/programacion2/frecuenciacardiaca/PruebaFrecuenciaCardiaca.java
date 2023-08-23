/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.frecuenciacardiaca;
/**
 *
 * @author osmin1
 */
import java.util.Scanner;
public class PruebaFrecuenciaCardiaca {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        FrecuenciaCardiaca frecuencia = new FrecuenciaCardiaca();
        
        System.out.println("Escriba el nombre del paciente: ");
        String nombre = entrada.nextLine();
        frecuencia.setnombre(nombre);
        
        System.out.println("Escriba el primer apellido del paciente: ");
        String Papellido = entrada.nextLine();
        frecuencia.setPapellido(Papellido);
        
        System.out.println("Escriba el segundo apellido del paciente:");
        String Sapellido = entrada.nextLine();
        frecuencia.setSapellido(Sapellido);
        
         System.out.println("Escriba el dia de nacimiento:");
         int diaN = entrada.nextInt();
         frecuencia.setdiaN(diaN);
         
         System.out.println("Escriba el mes de nacimiento:");
         int mesN = entrada.nextInt();
         frecuencia.setmesN(mesN);
         
         System.out.println("Escriba el a;o de nacimiento:");
         int yearN = entrada.nextInt();
         frecuencia.setyearN(yearN);
         
         System.out.println("_____________________________________________________");
         
         System.out.println("Nombre: "+ nombre + Papellido + Sapellido);
         System.out.println("Fecha de nacimiento: " +diaN+ "/" +mesN+ "/" +yearN);
         System.out.printf("Edad: %d %n", frecuencia.getEdad());
         System.out.printf("Frecuencia cardiaca Max: %s %n", frecuencia.getFrecuenciaCardiacaMax());
         System.out.printf("Frecuencia cardiaca Esperada: %s %n", frecuencia.getFrecuenciaCardiacaEsperada());
          
         System.out.println("_____________________________________________________");
    }
}
