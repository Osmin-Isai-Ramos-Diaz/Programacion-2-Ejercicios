/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.x4;

/**
 *
 * @author osmin
 */
public final class Rectangulo {
    private double longitud;
    private double anchura;

    public Rectangulo() {
        this(1.0, 1.0);
    }

    public Rectangulo(double longitud, double anchura) {
        setLongitud(longitud);
        setAnchura(anchura);
    }

    public double calcularPerimetro() {
        return 2 * (longitud + anchura);
    }

    public double calcularArea() {
        return longitud * anchura;
    }

    public void setLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        } else {
            throw new IllegalArgumentException("La longitud debe estar entre 0.0 y 20.0");
        }
    }

    public void setAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        } else {
            throw new IllegalArgumentException("La anchura debe estar entre 0.0 y 20.0");
        }
    }

    public double getLongitud() {
        return longitud;
    }

    public double getAnchura() {
        return anchura;
    }
}