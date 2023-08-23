/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x19;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class ReservacionesAerolinea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] asientos = new boolean[11]; // Índice 0 no se usa, índices 1-5: Primera Clase, índices 6-10: Económico

        while (true) {
            System.out.println("Por favor escriba 1 para Primera Clase o 2 para Económico:");
            int opcion = scanner.nextInt();

            if (opcion == 1) {
                int asiento = asignarAsiento(asientos, 1, 5);
                if (asiento != -1) {
                    imprimirPaseDeAbordar(asiento, "Primera Clase");
                } else {
                    System.out.println("Primera Clase está llena. ¿Aceptar Económico? (1 para Sí, 2 para No)");
                    int aceptarEconomico = scanner.nextInt();
                    if (aceptarEconomico == 1) {
                        asiento = asignarAsiento(asientos, 6, 10);
                        if (asiento != -1) {
                            imprimirPaseDeAbordar(asiento, "Económico");
                        } else {
                            System.out.println("Lo sentimos, todos los asientos están ocupados. El próximo vuelo sale en 3 horas.");
                        }
                    }
                }
            } else if (opcion == 2) {
                int asiento = asignarAsiento(asientos, 6, 10);
                if (asiento != -1) {
                    imprimirPaseDeAbordar(asiento, "Económico");
                } else {
                    System.out.println("Económico está lleno. ¿Aceptar Primera Clase? (1 para Sí, 2 para No)");
                    int aceptarPrimeraClase = scanner.nextInt();
                    if (aceptarPrimeraClase == 1) {
                        asiento = asignarAsiento(asientos, 1, 5);
                        if (asiento != -1) {
                            imprimirPaseDeAbordar(asiento, "Primera Clase");
                        } else {
                            System.out.println("Lo sentimos, todos los asientos están ocupados. El próximo vuelo sale en 3 horas.");
                        }
                    }
                }
            }
        }
    }

    private static int asignarAsiento(boolean[] asientos, int inicio, int fin) {
        for (int i = inicio; i <= fin; i++) {
            if (!asientos[i]) {
                asientos[i] = true;
                return i;
            }
        }
        return -1; // Todos los asientos están ocupados
    }

    private static void imprimirPaseDeAbordar(int asiento, String clase) {
        System.out.println("¡Gracias por su reserva!");
        System.out.println("Pase de Abordar:");
        System.out.println("Asiento: " + asiento);
        System.out.println("Clase: " + clase);
        System.out.println("------------------------------");
    }
}
