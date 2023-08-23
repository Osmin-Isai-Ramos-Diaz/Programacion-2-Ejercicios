/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x20;

/**
 *
 * @author osmin
 */
public class CalcularPi {
    public static void main(String[] args) {
        int terminos = 200000;
        double piAproximado = 0.0;
        boolean sumar = true;

        System.out.println("Término\tValor Aproximado de Pi");

        for (int termino = 1; termino <= terminos; termino++) {
            double terminoActual = 4.0 / (2 * termino - 1);

            if (sumar) {
                piAproximado += terminoActual;
            } else {
                piAproximado -= terminoActual;
            }

            sumar = !sumar;

            if (termino % 10000 == 0) {
                System.out.printf("%d\t%.6f%n", termino, piAproximado);
            }
        }
    }
}
