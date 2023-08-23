/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x30;

/**
 *
 * @author osmin
 */
public class PruebaPaqueteDeCartas
{
    public static void main(String[] args)
    {
        PaqueteDeCartas miPaqueteDeCartas = new PaqueteDeCartas();
        miPaqueteDeCartas.barajar();

        Carta[] mano = new Carta[5];

        // Repartir una mano de póquer de cinco cartas
        for (int i = 0; i < 5; i++)
        {
            mano[i] = miPaqueteDeCartas.repartirCarta();
        }

        // Mostrar la mano de póquer
        System.out.println("Mano de póquer:");
        for (Carta carta : mano)
        {
            System.out.println(carta);
        }

        // Verificar combinaciones de manos
        System.out.println("\nCombinaciones de manos:");
        if (miPaqueteDeCartas.contienePar(mano))
        {
            System.out.println("Contiene un par");
        }
        
        if (miPaqueteDeCartas.contieneDosPares(mano))
        {
            System.out.println("Contiene dos pares");
        }
        
        if (miPaqueteDeCartas.contieneTercia(mano))
        {
            System.out.println("Contiene una tercia");
        }

        // Agregar más verificaciones de combinaciones de manos aquí

        // ...
    }
}