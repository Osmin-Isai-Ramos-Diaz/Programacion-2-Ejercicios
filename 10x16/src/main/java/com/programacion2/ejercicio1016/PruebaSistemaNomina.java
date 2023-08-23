/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.ejercicio1016;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PruebaSistemaNomina {
    public static void main(String[] args) {
        DecimalFormat formatoDinero = new DecimalFormat("$#,##0.00");
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos para el empleado asalariado
        System.out.println("Ingrese los datos del empleado asalariado:");
        System.out.print("Primer nombre: ");
        String primerNombreAsalariado = scanner.nextLine();
        System.out.print("Apellido paterno: ");
        String apellidoPaternoAsalariado = scanner.nextLine();
        System.out.print("Número de seguro social: ");
        String numeroSeguroSocialAsalariado = scanner.nextLine();
        System.out.print("Salario semanal: ");
        double salarioSemanal = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el búfer de entrada

        EmpleadoAsalariado empleadoAsalariado =
                new EmpleadoAsalariado(primerNombreAsalariado, apellidoPaternoAsalariado,
                        numeroSeguroSocialAsalariado, salarioSemanal);

        // Solicitar datos para el empleado por horas
        System.out.println("\nIngrese los datos del empleado por horas:");
        System.out.print("Primer nombre: ");
        String primerNombrePorHoras = scanner.nextLine();
        System.out.print("Apellido paterno: ");
        String apellidoPaternoPorHoras = scanner.nextLine();
        System.out.print("Número de seguro social: ");
        String numeroSeguroSocialPorHoras = scanner.nextLine();
        System.out.print("Sueldo por hora: ");
        double sueldoPorHora = scanner.nextDouble();
        System.out.print("Horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el búfer de entrada

        EmpleadoPorHoras empleadoPorHoras =
                new EmpleadoPorHoras(primerNombrePorHoras, apellidoPaternoPorHoras,
                        numeroSeguroSocialPorHoras, sueldoPorHora, horasTrabajadas);

        // Solicitar datos para el empleado por comisión
        System.out.println("\nIngrese los datos del empleado por comisión:");
        System.out.print("Primer nombre: ");
        String primerNombrePorComision = scanner.nextLine();
        System.out.print("Apellido paterno: ");
        String apellidoPaternoPorComision = scanner.nextLine();
        System.out.print("Número de seguro social: ");
        String numeroSeguroSocialPorComision = scanner.nextLine();
        System.out.print("Ventas brutas: ");
        double ventasBrutas = scanner.nextDouble();
        System.out.print("Tarifa de comisión: ");
        double tarifaComision = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el búfer de entrada

        EmpleadoPorComision empleadoPorComision =
                new EmpleadoPorComision(primerNombrePorComision, apellidoPaternoPorComision,
                        numeroSeguroSocialPorComision, ventasBrutas, tarifaComision);

        // Solicitar datos para el empleado base más comisión
        System.out.println("\nIngrese los datos del empleado base más comisión:");
        System.out.print("Primer nombre: ");
        String primerNombreBaseMasComision = scanner.nextLine();
        System.out.print("Apellido paterno: ");
        String apellidoPaternoBaseMasComision = scanner.nextLine();
        System.out.print("Número de seguro social: ");
        String numeroSeguroSocialBaseMasComision = scanner.nextLine();
        System.out.print("Ventas brutas: ");
        double ventasBrutasBaseMasComision = scanner.nextDouble();
        System.out.print("Tarifa de comisión: ");
        double tarifaComisionBaseMasComision = scanner.nextDouble();
        System.out.print("Salario base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el búfer de entrada

        EmpleadoBaseMasComision empleadoBaseMasComision =
                new EmpleadoBaseMasComision(primerNombreBaseMasComision, apellidoPaternoBaseMasComision,
                        numeroSeguroSocialBaseMasComision, ventasBrutasBaseMasComision,
                        tarifaComisionBaseMasComision, salarioBase);

        System.out.println("\nEmpleados procesados por separado:\n");

        System.out.printf("%s%n%s: %s%n%n",
                empleadoAsalariado, "ingresos", formatoDinero.format(empleadoAsalariado.obtenerMontoPago()));
        System.out.printf("%s%n%s: %s%n%n",
                empleadoPorHoras, "ingresos", formatoDinero.format(empleadoPorHoras.obtenerMontoPago()));
        System.out.printf("%s%n%s: %s%n%n",
                empleadoPorComision, "ingresos", formatoDinero.format(empleadoPorComision.obtenerMontoPago()));
        System.out.printf("%s%n%s: %s%n%n",
                empleadoBaseMasComision, "ingresos", formatoDinero.format(empleadoBaseMasComision.obtenerMontoPago()));

        scanner.close();
    }
}