/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x4;

/**
 *
 * @author osmin
 */
public class App {

        public static void main(String[] args) {
        try {
            double longitud = Double.parseDouble(args[0]);
            double anchura = Double.parseDouble(args[1]);

            Rectangulo rectangulo = new Rectangulo(longitud, anchura);
            System.out.println("Área: " + rectangulo.calcularArea());
            System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ingrese dos números como argumentos.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
