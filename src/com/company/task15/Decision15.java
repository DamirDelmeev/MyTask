package com.company.task15;

import java.util.Scanner;

public class Decision15 {
    public static void main(String[] args) {
        int dimension=0;
        do {
            Scanner scan1 = new Scanner(System.in);
            System.out.println("Введите размерность матрицы.");
            dimension = scan1.nextInt();
        } while (dimension > 10 | dimension < 0);
        int[][] matrix = input(dimension);
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            findNumberForSum(matrix[i]);
            result += findNumberForSum(matrix[i]);
        }
        System.out.println("Result: " + result);
    }

    static int[][] input(int dimension) {
        int matrix[][] = new int[dimension][dimension];
        Scanner scan2 = new Scanner(System.in);
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = scan2.nextInt();
            }
        }
        return matrix;
    }

    static int findNumberForSum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] > 0 & arr[i + 1] > 0) {
                return 0;
            } else if (i < arr.length - 2 && arr[i] > 0 & arr[i + 2] > 0) {
                return arr[i + 1];
            }
        }
        return 0;
    }
}