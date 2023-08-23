/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.programacion2.x13;

/**
 *
 * @author osmin1
 */
import java.util.Scanner;
public class PruebaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer nombre del empleado: ");
        String primerNombre1 = entrada.nextLine();
        System.out.print("Ingrese el apellido paterno del empleado: ");
        String apellidoPaterno1 = entrada.nextLine();
        System.out.print("Ingrese el salario mensual del empleado: ");
        double salarioMensual1 = entrada.nextDouble();

        entrada.nextLine(); 

        System.out.print("Ingrese el primer nombre del segundo empleado: ");
        String primerNombre2 = entrada.nextLine();
        System.out.print("Ingrese el apellido paterno del segundo empleado: ");
        String apellidoPaterno2 = entrada.nextLine();
        System.out.print("Ingrese el salario mensual del segundo empleado: ");
        double salarioMensual2 = entrada.nextDouble();

        Empleado empleado1 = new Empleado(primerNombre1, apellidoPaterno1, salarioMensual1);
        Empleado empleado2 = new Empleado(primerNombre2, apellidoPaterno2, salarioMensual2);

        System.out.println("\nInformación de los empleados:");

        System.out.printf("%s %s - Salario Anual: %.2f%n", empleado1.obtenerPrimerNombre(), empleado1.obtenerApellidoPaterno(), empleado1.obtenerSalarioAnual());
        System.out.printf("%s %s - Salario Anual: %.2f%n%n", empleado2.obtenerPrimerNombre(), empleado2.obtenerApellidoPaterno(), empleado2.obtenerSalarioAnual());

        System.out.println("Aplicando un aumento del 10% a los salarios:");

        empleado1.aplicarAumentoSalario(10);
        empleado2.aplicarAumentoSalario(10);

        System.out.println("\nNueva información de los empleados después del aumento:");

        System.out.printf("%s %s - Salario Anual: %.2f%n", empleado1.obtenerPrimerNombre(), empleado1.obtenerApellidoPaterno(), empleado1.obtenerSalarioAnual());
        System.out.printf("%s %s - Salario Anual: %.2f%n", empleado2.obtenerPrimerNombre(), empleado2.obtenerApellidoPaterno(), empleado2.obtenerSalarioAnual());

        entrada.close();
    }
}