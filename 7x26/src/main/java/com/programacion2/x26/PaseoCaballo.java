/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x26;

/**
 *
 * @author osmin
 */
public class PaseoCaballo {
    static final int horizontal[] = {2, 1, -1, -2, -2, -1, 1, 2};
    static final int vertical[] = {-1, -2, -2, -1, 1, 2, 2, 1};

    static final int filas = 8, columnas = 8;
    static final int casillas = filas * columnas;
    static boolean tablero[][] = new boolean[filas][columnas];
    static int posiciones[][] = new int[filas][columnas];

    static int filaActual = 3, columnaActual = 4;
    static int numeroMovimiento = 0;

    static final int filaInicial = 3; // Fila inicial del caballo
    static final int columnaInicial = 4; // Columna inicial del caballo

    public static void main(String[] args) {
        int filaAnterior;
        int columnaAnterior;
        int movimiento = 0;

        tablero[filaActual][columnaActual] = true;
        posiciones[filaActual][columnaActual] = ++movimiento;

        for (int ciclo = 1; ciclo <= casillas; ciclo++) {
            // ... (código anterior)
        }

        imprimirRecorrido();

        // Verificar si el paseo fue completo
        if (movimiento == casillas) {
            System.out.println("El paseo fue completo.");
        } else {
            System.out.println("El paseo NO fue completo.");
        }

        // Verificar si el paseo fue cerrado
        int distanciaFila = Math.abs(filaActual - filaInicial);
        int distanciaColumna = Math.abs(columnaActual - columnaInicial);

        if (movimiento == casillas - 1 && (distanciaFila == 2 && distanciaColumna == 1) ||
            (distanciaFila == 1 && distanciaColumna == 2)) {
            System.out.println("El paseo fue cerrado.");
        } else {
            System.out.println("El paseo NO fue cerrado.");
        }
    }

    // ... (código anterior)

    private static void imprimirMovimientos(int movimientos) {
        // ... (código anterior)
    }

    private static void imprimirRecorrido() {
        // ... (código anterior)
    }

    private static int columna(int columnaActual) {
        // ... (código anterior)
        return 0;
        // ... (código anterior)
    }

    private static int fila(int filaActual) {
        // ... (código anterior)
        return 0;
        // ... (código anterior)
    }
}