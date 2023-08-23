/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x37;

/**
 *
 * @author osmin
 */
import java.util.Scanner;

public class SimpletronSimulator {
    private static final int MEM_SIZE = 100;

    private int[] memory = new int[MEM_SIZE];
    private int accumulator = 0;
    private int instructionCounter = 0;

    public void loadProgram(int[] program) {
        System.arraycopy(program, 0, memory, 0, Math.min(program.length, MEM_SIZE));
    }

    public void executeProgram() {
        System.out.println("*** Inicio de la ejecucion de Simpletron ***");

        while (instructionCounter < MEM_SIZE) {
            int instruction = memory[instructionCounter];
            int opCode = instruction / 100;
            int operand = instruction % 100;

            switch (opCode) {
                case 10:
                    // Lee
                    System.out.print("?");
                    int input = new Scanner(System.in).nextInt();
                    memory[operand] = input;
                    break;
                case 11:
                    // Escribe
                    System.out.println("Salida: " + memory[operand]);
                    break;
                case 20:
                    // Carga
                    accumulator = memory[operand];
                    break;
                case 30:
                    // Suma
                    accumulator += memory[operand];
                    break;
                case 43:
                    // Alto
                    System.out.println("*** Fin de la ejecucion de Simpletron ***");
                    dumpComputerState();
                    return;
                default:
                    System.out.println("*** Error: Codigo de operacion invalido ***");
                    dumpComputerState();
                    return;
            }

            instructionCounter++;
        }

        System.out.println("*** Error: Memoria llena sin instruccion de alto ***");
        dumpComputerState();
    }

    private void dumpComputerState() {
        // Imprimir los valores de los registros y la memoria
        // Implementar según el formato de vaciado mostrado en la figura 7.37
    }

    public static void main(String[] args) {
        SimpletronSimulator simulator = new SimpletronSimulator();

        // Cargar un programa en la memoria
        int[] program = {
            1010, 1011, 2009, 3110, 4107,
            1109, 4300, 1110, 4300, 0000,
            0000, -99999
        };
        simulator.loadProgram(program);

        // Ejecutar el programa
        simulator.executeProgram();
    }
}
