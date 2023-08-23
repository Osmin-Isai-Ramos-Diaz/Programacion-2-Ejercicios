/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.programacion2.x24;

/**
 *
 * @author osmin
 */
public class OchoReinas {

    static int N = 8;
    static int[][] board = new int[N][N];

    public static void main(String[] args) {
        solveNQueens();
        printBoard();
    }

    static void solveNQueens() {
        if (solveNQueensUtil(0)) {
            System.out.println("Solución encontrada.");
        } else {
            System.out.println("No se encontró solución.");
        }
    }

    static boolean solveNQueensUtil(int col) {
        if (col >= N) {
            return true;
        }

        for (int row = 0; row < N; row++) {
            if (isSafe(row, col)) {
                board[row][col] = 1;

                if (solveNQueensUtil(col + 1)) {
                    return true;
                }

                board[row][col] = 0; // backtrack
            }
        }

        return false;
    }

    static boolean isSafe(int row, int col) {
        for (int i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    static void printBoard() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}