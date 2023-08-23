/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x21;

/**
 *
 * @author osmin
 */
public class TernasPitagoricas {
    public static void main(String[] args) {
        System.out.println("Ternas Pitagóricas:");
        System.out.println("Lado 1\tLado 2\tHipotenusa");

        for (int lado1 = 1; lado1 <= 500; lado1++) {
            for (int lado2 = lado1; lado2 <= 500; lado2++) {
                for (int hipotenusa = lado2; hipotenusa <= 500; hipotenusa++) {
                    if (esTernaPitagorica(lado1, lado2, hipotenusa)) {
                        System.out.printf("%d\t%d\t%d%n", lado1, lado2, hipotenusa);
                    }
                }
            }
        }
    }

    public static boolean esTernaPitagorica(int lado1, int lado2, int hipotenusa) {
        return (lado1 * lado1 + lado2 * lado2 == hipotenusa * hipotenusa);
    }
}
