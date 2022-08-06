package com.company.epamTasks.task20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Decision20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер строки,где будет храниться минимальное значение.");
        int rowForMin = scanner.nextInt();
        System.out.println("Введите номер столбца,где будет храниться минимальное значение.");
        int cowForMin = scanner.nextInt();

        Integer[][] userMatrix = putInMatrix();
        int minValue = findMinValue(userMatrix);

        Integer[][] matrixWithChangeRows = ChangeRows(rowForMin, userMatrix, minValue);
        Integer[] matrixForChange = findMatrixForChange(cowForMin, matrixWithChangeRows);
        Integer[][] matrixWithChangeCows = ChangeCows(cowForMin, minValue, matrixWithChangeRows, matrixForChange);
        showMatrix(matrixWithChangeCows);
    }

    private static Integer[][] ChangeCows(int cowForMin, int minValue, Integer[][] matrixWithChangeRows,
                                          Integer[] matrixForChange) {
        for (int i = 0; i < matrixWithChangeRows.length; i++) {
            for (int j = 0; j < matrixWithChangeRows.length; j++) {
                if (matrixWithChangeRows[i][j] == minValue) {
                    for (int k = 0; k < matrixWithChangeRows.length; k++) {
                        matrixWithChangeRows[k][cowForMin] = matrixWithChangeRows[k][j];
                        matrixWithChangeRows[k][j] = matrixForChange[k];
                    }
                    return matrixWithChangeRows;
                }
            }

        }
        return null;
    }

    private static Integer[] findMatrixForChange(int cowForMin, Integer[][] matrixWithChangeRows) {
        Integer[] matrixForChange = new Integer[matrixWithChangeRows.length];
        for (int i = 0; i < matrixForChange.length; i++) {
            for (int j = 0; j < matrixForChange.length; j++) {
                matrixForChange[j] = matrixWithChangeRows[j][cowForMin];
            }
        }
        return matrixForChange;
    }

    private static Integer[][] ChangeRows(int rowForMin, Integer[][] userMatrix, int minValue) {
        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix.length; j++) {
                if (userMatrix[i][j] == minValue) {
                    Integer[] matrixForChange = userMatrix[rowForMin];
                    userMatrix[rowForMin] = userMatrix[i];
                    userMatrix[i] = matrixForChange;
                    return userMatrix;
                }
            }
        }
        return null;
    }

    private static int findMinValue(Integer[][] userMatrix) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < userMatrix.length; i++) {
            Collections.addAll(list, userMatrix[0]);
        }
        return Collections.min(list);
    }

    private static Integer[][] putInMatrix() {
        System.out.println("Введите размерность матрицы.");
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        Integer[][] userMatrix = new Integer[dimension][dimension];
        System.out.println("Заполните матрицу.");
        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix.length; j++) {
                userMatrix[i][j] = scanner.nextInt();
            }
        }
        return userMatrix;
    }

    private static void showMatrix(Integer[][] userMatrix) {
        for (Integer[] matrix : userMatrix) {
            System.out.println();
            for (int j = 0; j < userMatrix.length; j++) {
                if (matrix[j] >= 0) {
                    System.out.print(" " + matrix[j]);
                } else
                    System.out.print(matrix[j]);
            }
        }
    }

}
