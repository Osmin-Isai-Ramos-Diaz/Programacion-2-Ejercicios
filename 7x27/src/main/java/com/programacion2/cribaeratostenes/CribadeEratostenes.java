/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.cribaeratostenes;

/**
 *
 * @author osmin
 */
public class CribadeEratostenes {   // Abre clase Eratostenes
 private int DimArreglo = 1000;
 //Basta cambiar este numero para obtener
 // los primos hasta ese limite

 /////////////////////////////////////////////
 // METODO PRINCIPAL
 /////////////////////////////////////////////

 public void Principal()

 { //ABRE PRINCIPAL 
 boolean Arreglo[];
 Arreglo = new boolean[DimArreglo + 1];
 for ( int i = 1; i < DimArreglo; i++ )
 Arreglo[i] = true; //EN PRINCIPIO TODOS LOS NUMEROS SE CONSIDERAN PRIMOS

 for ( int j = 2; j <= DimArreglo; j++ )
 if ( true == Arreglo[j] ) // Para numeros grandes este if hace una 
                           // diferencia de tiempo importante
 for ( int k = 2; k <= (DimArreglo)/j; k++ )
 Arreglo[k*j] = false;

 // Se llama al metodo Imprime
 Imprime( Arreglo, DimArreglo );

 } //CIERRA PRINCIPAL 

 //////////////////////////////////////////////
 // IMPRIME
 //////////////////////////////////////////////

 public void Imprime( boolean A[], int Tamano )

 { //ABRE IMPRIME
 int contador = 0;

 for ( int m = 2; m <= Tamano; m++ )
 { //ABRE FOR
 if ( true == A[m] )
 contador++;
 } //CIERRA FOR


 System.out.printf("\n\nEstos son los %d numeros primos que hay ", contador);
 System.out.printf("entre 1 y %d\n\n", DimArreglo);

 int salto = 1; 
 for ( int n = 1; n <= Tamano; n++ )
 { //ABRE FOR
 
 if ( true == A[n] )
 {
 System.out.printf("%4d\t", n);
 salto++;
 }
 if ( 10 == salto )
 {
 System.out.println();
 salto = 1;
 }
 } //CIERRA FOR

 System.out.printf("\n");
 } //CIERRA IMPRIME  

 }   // Cierra clase Eratostenes