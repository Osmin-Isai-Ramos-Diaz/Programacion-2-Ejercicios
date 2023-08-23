/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.x30;

/**
 *
 * @author osmin
 */
import java.util.Arrays;

public class PaqueteDeCartas
{
    private Carta[] paquete;
    private int cartaActual;
    private static final int NUMERO_DE_CARTAS = 52;
    private static final SecureRandom numerosAleatorios = new SecureRandom();

    public PaqueteDeCartas()
    {
        // ... (el mismo constructor)
    }

    public void barajar()
    {
        // ... (el mismo método)
    }

    public Carta repartirCarta()
    {
        // ... (el mismo método)
    }

    // Nuevo método para determinar si una mano contiene un par
    public boolean contienePar(Carta[] mano)
    {
        // ... (implementación del método)
    }

    // Nuevo método para determinar si una mano contiene dos pares
    public boolean contieneDosPares(Carta[] mano)
    {
        // ... (implementación del método)
    }

    // Nuevo método para determinar si una mano contiene una tercia
    public boolean contieneTercia(Carta[] mano)
    {
        // ... (implementación del método)
    }

    // Otros métodos para determinar combinaciones de manos, como póquer, corrida, escalera, full house, etc.
    
    private String obtenerCara()
    {
        return cara;
    }

    private String obtenerPalo()
    {
        return palo;
    }
}
