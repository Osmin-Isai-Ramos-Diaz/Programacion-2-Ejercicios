/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.x14;

/**
 *
 * @author osmin
 */
public class Fecha {
    private int mes; // 1-12
    private int dia; // 1-31 con base en el mes
    private int anio; // cualquier año
    
    private static final String[] nombresMeses = {
        "", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };
    
    private static final int[] diasPorMes = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    
    public Fecha(int mes, int dia, int anio) {
        validarFecha(mes, dia);
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }
    
    public Fecha(String nombreMes, int dia, int anio) {
        validarFecha(nombreMes, dia);
        this.mes = obtenerNumeroMes(nombreMes);
        this.dia = dia;
        this.anio = anio;
    }
    
    public Fecha(int diaEnElAnio, int anio) {
        validarDiaEnElAnio(diaEnElAnio);
        this.anio = anio;
        int mesActual = 1;
        while (diaEnElAnio > diasPorMes[mesActual]) {
            diaEnElAnio -= diasPorMes[mesActual];
            mesActual++;
        }
        this.mes = mesActual;
        this.dia = diaEnElAnio;
    }
    
    private void validarFecha(int mes, int dia) {
        if (mes <= 0 || mes > 12)
            throw new IllegalArgumentException("mes (" + mes + ") debe ser 1-12");
        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))
            throw new IllegalArgumentException("dia (" + dia + 
                    ") fuera de rango para el mes y anio especificados");
    }
    
    private void validarFecha(String nombreMes, int dia) {
        if (dia <= 0 || dia > 31)
            throw new IllegalArgumentException("dia (" + dia + 
                    ") fuera de rango para el mes y anio especificados");
        if (!nombreMesValido(nombreMes))
            throw new IllegalArgumentException("Nombre de mes inválido: " + nombreMes);
        int numeroMes = obtenerNumeroMes(nombreMes);
        if (dia > diasPorMes[numeroMes])
            throw new IllegalArgumentException("dia (" + dia + 
                    ") fuera de rango para el mes y anio especificados");
    }
    
    private void validarDiaEnElAnio(int diaEnElAnio) {
        if (diaEnElAnio <= 0 || diaEnElAnio > 365)
            throw new IllegalArgumentException("Dia en el año (" + diaEnElAnio + 
                    ") fuera de rango");
    }
    
    private boolean nombreMesValido(String nombreMes) {
        for (String nombre : nombresMeses) {
            if (nombre.equalsIgnoreCase(nombreMes)) {
                return true;
            }
        }
        return false;
    }
    
    private int obtenerNumeroMes(String nombreMes) {
        for (int i = 1; i < nombresMeses.length; i++) {
            if (nombresMeses[i].equalsIgnoreCase(nombreMes)) {
                return i;
            }
        }
        return -1;
    }
    
    public void imprimirFormatos() {
        System.out.printf("%02d/%02d/%04d%n", mes, dia, anio);
        System.out.printf("%s %d, %04d%n", nombresMeses[mes], dia, anio);
        System.out.printf("%03d %04d%n", obtenerDiaEnElAnio(), anio);
    }
    
    private int obtenerDiaEnElAnio() {
        int diaEnElAnio = dia;
        for (int i = 1; i < mes; i++) {
            diaEnElAnio += diasPorMes[i];
        }
        if (mes > 2 && esAnioBisiesto(anio)) {
            diaEnElAnio++;
        }
        return diaEnElAnio;
    }
    
    private boolean esAnioBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }    
}
