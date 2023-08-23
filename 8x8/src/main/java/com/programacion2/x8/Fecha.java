/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.x8;

/**
 *
 * @author osmin
 */
public class Fecha {
    private int mes; // 1-12
    private int dia; // 1-31 con base en el mes
    private int anio; // cualquier año
    
    private static final int[] diasPorMes = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    // Constructor con comprobación de errores
    public Fecha(int mes, int dia, int anio) {
        if (mes <= 0 || mes > 12)
            throw new IllegalArgumentException("mes (" + mes + ") debe ser 1-12");
        
        if (dia <= 0 || (dia > diasPorMes[mes] && !(mes == 2 && dia == 29)))
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        
        if (mes == 2 && dia == 29 && !(anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)))
            throw new IllegalArgumentException("dia (" + dia + ") fuera de rango para el mes y anio especificados");
        
        if (anio <= 0)
            throw new IllegalArgumentException("anio (" + anio + ") debe ser un valor positivo");
        
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
        
        System.out.printf("Constructor de objeto Fecha para la fecha %s%n", this);
    }
    
    // Método toString para representar la fecha en formato mes/dia/anio
    @Override
    public String toString() {
        return String.format("%d/%d/%d", mes, dia, anio);
    }
    
    // Método para adelantar el día en uno
    public void siguienteDia() {
        if (dia < diasPorMes[mes]) {
            dia++;
        } else {
            dia = 1;
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                anio++;
            }
        }
    }
}
