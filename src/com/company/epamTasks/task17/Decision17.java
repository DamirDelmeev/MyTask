package com.company.epamTasks.task17;

import java.util.Scanner;

public class Decision17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = 0;
        do {
            System.out.println("Введите размерность матрицы от 0 до 10.");
            dimension = scanner.nextInt();
            int matrix[][] = putIn(dimension);
            int result = findDeterminant(matrix);
            System.out.println(result);
        } while (dimension < 0 | dimension > 10);
    }

    static int[][] putIn(int dimension) {
        System.out.println("Заполните матрицу.");
        Scanner scanner2 = new Scanner(System.in);
        int matrix[][] = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = scanner2.nextInt();
            }
        }
        return matrix;
    }

    static int findDeterminant(int matrix[][]) {
        int result = 0;
        if (matrix.length == 1) {
            return result;
        }
        if (matrix.length == 2) {
            result = getDoubleMinor(matrix);
        }
        if (matrix.length > 2) {
            for (int i = 0; i < matrix.length; i++) {
                int sign = (i % 2 == 0) ? 1 : -1;
                result += sign * matrix[0][i] * findDeterminant(findMinor(matrix, 0, i));
            }
        }
        return result;
    }

    private static int[][] findMinor(int matrix[][], int rowToRemove, int columnToRemove) {
        int[][] resultMinor = new int[matrix.length - 1][matrix.length - 1];
        for (int i = 0; i < resultMinor.length; i++) {
            for (int j = 0; j < resultMinor.length; j++) {
                int matrixI = (i >= rowToRemove) ? i + 1 : i;
                int matrixJ = (j >= columnToRemove) ? j + 1 : j;

                resultMinor[i][j] = matrix[matrixI][matrixJ];
            }
        }
        return resultMinor;
    }

    private static int getDoubleMinor(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
}
