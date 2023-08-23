/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x29;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de n para calcular el enésimo número de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("El enésimo número de Fibonacci es: " + calcularFibonacci(n));

        int mayorFibonacciInt = encontrarMayorFibonacciInt();
        System.out.println("El número de Fibonacci más grande que se puede imprimir en su sistema es: " + mayorFibonacciInt);

        double mayorFibonacciDouble = encontrarMayorFibonacciDouble();
        System.out.println("El número de Fibonacci más grande que se puede imprimir en su sistema como double es: " + mayorFibonacciDouble);
    }

    static int calcularFibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }

    static int encontrarMayorFibonacciInt() {
        int n = 0;
        while (true) {
            int fib = calcularFibonacci(n);
            if (fib < 0) {
                break;
            }
            n++;
        }
        return n - 1;
    }

    static double encontrarMayorFibonacciDouble() {
        double n = 0;
        while (true) {
            double fib = calcularFibonacci((int) n);
            if (fib == Double.POSITIVE_INFINITY) {
                break;
            }
            n++;
        }
        return n - 1;
    }
}