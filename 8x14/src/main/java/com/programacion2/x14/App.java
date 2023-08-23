/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x14;

/**
 *
 * @author osmin
 */
public class App {

        public static void main(String[] args) {
        Fecha fecha1 = new Fecha(6, 14, 1992);
        Fecha fecha2 = new Fecha("Junio", 14, 1992);
        Fecha fecha3 = new Fecha(166, 1992);
        
        System.out.println("Fecha 1:");
        fecha1.imprimirFormatos();
        
        System.out.println("Fecha 2:");
        fecha2.imprimirFormatos();
        
        System.out.println("Fecha 3:");
        fecha3.imprimirFormatos();
    }
}
