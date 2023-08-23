/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x31;

/**
 *
 * @author osmin
 */
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumeroModificado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAdivinar = random.nextInt(1000) + 1;
        int intento;
        int numeroIntentos = 0;
        boolean adivinado = false;

        System.out.println("Adivina un número entre 1 y 1000.");

        do {
            System.out.print("Escribe tu intento: ");
            intento = scanner.nextInt();
            numeroIntentos++;

            if (intento == numeroAdivinar) {
                adivinado = true;
                System.out.println("¡Felicidades! ¡Adivinaste el número!");
            } else if (intento < numeroAdivinar) {
                System.out.println("Demasiado bajo. ¡Inténtalo de nuevo!");
            } else {
                System.out.println("Demasiado alto. ¡Inténtalo de nuevo!");
            }
        } while (!adivinado && numeroIntentos < 10);

        if (numeroIntentos < 10) {
            if (numeroIntentos == 1) {
                System.out.println("¡O ya sabía usted el secreto, o tuvo suerte!");
            } else {
                System.out.println("¡Aja! ¡Sabía usted el secreto!");
            }
        } else {
            System.out.println("¡Debería haberlo hecho mejor! ¿Por qué no se deben requerir más de 10 intentos?");
        }

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