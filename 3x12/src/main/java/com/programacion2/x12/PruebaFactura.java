/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion2.x12;

/**
 *
 * @author osmin1
 */
public class PruebaFactura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura factura1 = new Factura("12345", "Martillo", 5, 12.99);
        Factura factura2 = new Factura("67890", "Destornillador", 10, 4.5);

        System.out.printf("Factura 1:%nNúmero de pieza: %s%nDescripción: %s%nCantidad: %d%nPrecio por artículo: %.2f%nMonto de factura: %.2f%n%n",
                factura1.obtenerNumeroPieza(), factura1.obtenerDescripcionPieza(), factura1.obtenerCantidad(),
                factura1.obtenerPrecioPorArticulo(), factura1.obtenerMontoFactura());

        System.out.printf("Factura 2:%nNúmero de pieza: %s%nDescripción: %s%nCantidad: %d%nPrecio por artículo: %.2f%nMonto de factura: %.2f%n%n",
                factura2.obtenerNumeroPieza(), factura2.obtenerDescripcionPieza(), factura2.obtenerCantidad(),
                factura2.obtenerPrecioPorArticulo(), factura2.obtenerMontoFactura());
    }
}
