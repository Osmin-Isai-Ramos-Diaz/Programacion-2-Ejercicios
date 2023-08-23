/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.simpletron;

/**
 *
 * @author osmin
 */

import java.util.Scanner;
public class Simpletron {
	private int acumulador;	
	private int [] memoria;
	private int registroInstrucciones;	
	private int contadorInstrucciones;	
	private int codigoOperacion;
	private int operando;
	
	public Simpletron ( ) 
	{
		pantallaMensajeBienvenido ();
		inicializarVariables ();
		
	}	
	public void pantallaMensajeBienvenido ( ) 
	{
			System.out.println("***¡Bienvenido a Simpletron!***");
			System.out.println("*** Por favor, introduzca en su programa una instruccion***");
			System.out.println("*** (o palabra de datos) a la vez. Yo le mostrare                        ***");
			System.out.println("*** el numero de ubicacion y un signo de interrogacion (?)   ***");
			System.out.println("*** Entonces usted escribira la palabra para esa ubicacion.  ***");
			System.out.println("*** Teclee -99999 para dejar de introducir su programa. ***");
			System.out.println("Loc  Inst");
                                                      System.out.println("**** ****");
	}

	public void runSimulador () 
	{
		int instruccionEnviada = 0;
		int rutaMemoria = 0;

		Scanner input = new Scanner ( System.in );

		do
		{
			System.out.printf ("%d %s  ", rutaMemoria, "?" );
			instruccionEnviada = input.nextInt ();
			if ( instruccionEnviada != -99999 ) 
				memoria [ rutaMemoria ] = instruccionEnviada;
			rutaMemoria++;
			
		} while ( instruccionEnviada != -99999 );
		
	        System.out.printf ("\n%s%s", "*** Carga del programa completada ***\n", 
				"*** Comienza la ejecución del programa  ***\n");	
		
			for ( int code : memoria ) 
		{
	
			if ( code != 0 )
			{
				cargar ();
				ejecutar (operando, codigoOperacion );
			}
		}

	}
	
	public void inicializarVariables ( )
	{
		memoria = new int [100];
		contadorInstrucciones = 0;

	}

	public void cargar ( ) 
	{
		
		codigoOperacion = memoria [ contadorInstrucciones ] / 100;
		operando = memoria [ contadorInstrucciones ] % 100;

	}	

	public void ejecutar (int operandos, int operacion ) 
	{

		switch ( operacion ) 
		{
			case 10:
				Scanner entrada = new Scanner ( System.in );
				System.out.print ( "Ingrese un número entero (positivo o negativo): " );
				memoria [ operandos ] = entrada.nextInt ();
				break;

			case 11:
				System.out.println ("El resultado de la operación es " + memoria [ operandos] );
				break;
			case 20:
				acumulador = memoria [ operandos ];
				break;
			case 21: 
				memoria [ operandos ] = acumulador;
				break;
			case 30:
				acumulador += memoria [ operandos ];
				break;
			case 31: 
				acumulador -= memoria [ operandos ];
				break;
			case 32:
				acumulador /=  memoria [ operandos ];
				break;
			case 33: 
				acumulador *= memoria [ operandos ];
				break;
			case 40:
				contadorInstrucciones = operandos;
				break;
			case 41:
				if ( acumulador < 0 )
					contadorInstrucciones = operandos;
				break;
			case 42:
				if ( acumulador == 0 )
					contadorInstrucciones = operandos;
				break;
			case 43:
				volcadoenMemoria ();
				System.out.printf ("\n%s\n", "El programa ha terminado...");
				System.exit ( 0 );
				break;

		}

		contadorInstrucciones++;
		}

	
	public void volcadoenMemoria ( )
	{
		System.out.printf ("\n%30s\n%30s\t%s%4d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n\n%30s\n", "REGISTERS:", 
				"acumulador", "+", acumulador, "Contador de Instrucciones", contadorInstrucciones, "Registro de Instrucciones",
			       	contadorInstrucciones, "Codigo de Operaciones", codigoOperacion, "Operando", operando, "Memoria:" );


		for ( int i = 0; i < 10; i++ )
		{
			System.out.printf ( "%6d", i);
		}

		System.out.println ();
		int eContador = 0;	

		for (int i = 0; i < 10; i++ ) 
		{
			if ( eContador %10 == 0 )
				System.out.printf ("%2d ", eContador);
			for (int j = 0; j < 10; j++) 
			{	
					if ( memoria [ eContador ] == 0 )
					System.out.printf ( "%s%s", "+", "0000 ");
				else 
					System.out.printf ("%s%4d ", "+", memoria [eContador]);
				eContador++;

			}
		       
		System.out.println ();	

		}
	}

}
