/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x30;

/**
 *
 * @author osmin
 */
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(1000) + 1;
        int intento;
        boolean adivinado = false;

        System.out.println("Adivina un número entre 1 y 1000.");

        do {
            System.out.print("Escribe tu intento: ");
            intento = scanner.nextInt();

            if (intento == numeroAdivinar) {
                adivinado = true;
                System.out.println("¡Felicidades! ¡Adivinaste el número!");
            } else if (intento < numeroAdivinar) {
                System.out.println("Demasiado bajo. ¡Inténtalo de nuevo!");
            } else {
                System.out.println("Demasiado alto. ¡Inténtalo de nuevo!");
            }
        } while (!adivinado);

        System.out.print("¿Quieres jugar otra vez? (Sí = 1 / No = 0): ");
        int jugarOtraVez = scanner.nextInt();

        if (jugarOtraVez == 1) {
            main(args); // Reinicia el juego
        } else {
            System.out.println("Gracias por jugar. ¡Hasta luego!");
        }

        scanner.close();
    }
}