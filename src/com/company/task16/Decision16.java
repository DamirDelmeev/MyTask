package com.company.task16;

import java.util.Scanner;

public class Decision16 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int dimension = 0;
        do {
            System.out.println("Введите размерность матрицы от 0 до 10.");
            dimension = scan1.nextInt();
            int matrix[][] = putIn(dimension);

            int[][] result = turnMatrix(matrix);
            showMatrix(result);
        } while (dimension < 0 | dimension > 10);
    }

    static int[][] putIn(int dimension) {
        System.out.println("Заполните матрицу.");
        Scanner scan2 = new Scanner(System.in);
        int matrix[][] = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matrix[i][j] = scan2.nextInt();
            }
        }
        return matrix;
    }

    static int[][] turnMatrix(int inMatrix[][]) {
        int resultChoice = getResultChoice();


        int outMatrix[][] = null;
        switch (resultChoice) {

            case 0:
                System.out.println("Результат поворота на 0 градусов:");
                outMatrix = inMatrix;
                break;
            case 1:
                System.out.println("Результат поворота на 90 градусов:");
                outMatrix = new int[inMatrix.length][inMatrix.length];
                for (int i = 0; i < inMatrix.length; i++) {
                    for (int j = 0; j < inMatrix.length; j++) {
                        outMatrix[j][inMatrix.length - i - 1] = inMatrix[i][j];
                    }
                }
                break;
            case 2:
                System.out.println("Результат поворота на 180 градусов:");
                outMatrix = new int[inMatrix.length][inMatrix.length];
                for (int i = 0; i < inMatrix.length; i++) {
                    for (int j = 0; j < inMatrix.length; j++) {
                        outMatrix[inMatrix.length - i - 1][inMatrix.length - j - 1] = inMatrix[i][j];
                    }
                }
                break;
            case 3:
                System.out.println("Результат поворота на 270 градусов:");
                outMatrix = new int[inMatrix.length][inMatrix.length];
                for (int i = 0; i < inMatrix.length; i++) {
                    for (int j = 0; j < inMatrix.length; j++) {
                        outMatrix[inMatrix.length - j - 1][i] = inMatrix[i][j];
                    }
                }
                break;
        }
        return outMatrix;
    }

    private static int getResultChoice() {
        System.out.println("Укажите любое число от -100 до 100 для поворота матрицы.");
        int userChoice = 0;
        do {
            userChoice = new Scanner(System.in).nextInt();
            int resultChoice = userChoice % 4;
            if (resultChoice == -3) {
                resultChoice = 1;
            }
            if (resultChoice == -2) {
                resultChoice = 2;
            }
            if (resultChoice == -1) {
                resultChoice = 3;
            }
            return resultChoice;
        } while (userChoice < -100 | userChoice > 100);
    }

    static void showMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.print(matrix[i][j] + " ");
                } else
                    System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
