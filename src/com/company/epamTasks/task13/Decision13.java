package com.company.epamTasks.task13;

import java.util.Scanner;

public class Decision13 {
    public static void main(String[] args) {
        System.out.println("Введите размерность квадратной матрицы.");
        int[][] matrix = new Decision13().readMatrix();
        if (matrix == null) {
            System.out.println("Матрица такого размера недопустима.");
        } else {
            System.out.println("Введите число на которое будет совершён циклический сдвиг матрицы.");
            new Decision13().printNewMatrix(matrix);
        }
    }

    private int[][] readMatrix() {
        Scanner scan1 = new Scanner(System.in);
        int dimension = scan1.nextInt();
        if (dimension <= 0 || dimension > 10) {
            return null;
        }
        System.out.println("Размерность квадратной матрицы будет ровна: " + dimension + ".");
        System.out.println("Введите элементы матрицы ,через пробел.");
        int matrix[][] = new int[dimension][dimension];
        for (int row = 0; row < dimension; row++) {
            for (int cow = 0; cow < dimension; cow++) {
                matrix[row][cow] = scan1.nextInt();
            }
        }
        return matrix;
    }

    private void printNewMatrix(int[][] matrix) {
        Scanner scan2 = new Scanner(System.in);
        int variableChange = scan2.nextInt();
        for (int row = 0; row < matrix.length; ++row) {
            int newRow = (matrix.length + row - variableChange) % matrix.length;
            for (int col = 0; col < matrix.length; ++col) {
                System.out.print(matrix[newRow][col] + " ");
            }
            System.out.println();
        }
    }
}