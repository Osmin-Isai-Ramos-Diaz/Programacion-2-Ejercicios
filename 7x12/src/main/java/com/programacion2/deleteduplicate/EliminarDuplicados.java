/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.deleteduplicate;

/**
 *
 * @author osmin
 */
import java.util.Scanner;
public class EliminarDuplicados {
    Scanner entrada = new Scanner(System.in);
    int dim = 5;
    enum Imprimir{SI, NO};
    int Arreglo[] = new int [dim];
    public void Recibe(){
        for(int i=0;i<Arreglo.length;i++){
            System.out.println("Introduzca un numero entre 10 y 100 incluyendolos");
            int n = entrada.nextInt();
            Arreglo[i]=n;
            while(n < 10 || n > 100) {
                System.out.println("Valores invalidos, introduzca valores correctos");
                n=entrada.nextInt();
                Arreglo[i] = n;   
            }
            if(i==0){
                System.out.println("\n" +Arreglo[i]+"Numero valido, no duplicado");
            }else{
                if(i != 0){
                    Imprimir estado = Imprimir.SI;
                    
                    for(int j = 0;j<i;j++){
                        if(Arreglo[i]==Arreglo[j]){
                            estado = Imprimir.NO;
                            break;
                        }
                    }
                    if(estado == Imprimir.SI){
                        System.out.println("\n"+Arreglo[i]+" Numero valido, no duplicado\n");
                    }
                }
             
            }
    }
    System.out.print("Valores unicos introducidos");
    for(int i = 0; i < Arreglo.length;i++){
        if(i==0){
            System.out.printf("%d", Arreglo[i]);
        }else{
            if(i !=0){
                Imprimir estado = Imprimir.SI;
                
                for (int j=0;j<i;j++){
                    if(Arreglo[i]==Arreglo[j]){
                        estado = Imprimir.NO;
                        break;
                    }
                }
                if(estado == Imprimir.SI)
                        System.out.printf("-%d", Arreglo[i]);
            }
        }
    }
    }
}
    


