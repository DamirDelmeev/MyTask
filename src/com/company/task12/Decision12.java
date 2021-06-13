package com.company.task12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Decision12 {

    public static void main(String[] args) {
        System.out.println("Введите размерность квадратной матрицы.");
        Decision12 obj = new Decision12();
        int[][] injectingArray = obj.readMatrix();
        if (injectingArray == null) {
            System.out.println("Матрица такого размера недопустима.");
        } else {
            System.out.println("Введите номер столбца по которому хотите отфильтровать массив.");
            int[][] resultMatrix = obj.realiseSort(injectingArray);
            obj.toString(resultMatrix);
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

        int[][] matrix = new int[dimension][dimension];
        for (int row = 0; row < dimension; row++) {
            for (int cow = 0; cow < dimension; cow++) {
                matrix[row][cow] = scan1.nextInt();
            }
        }
        return matrix;
    }

    private int[][] realiseSort(int[][] array) {
        Scanner scan2 = new Scanner(System.in);
        int sortCow = scan2.nextInt();
        System.out.println("Результат:");
        Comparator<int[]> myComparator = (o1, o2) -> Integer.compare(o1[sortCow], o2[sortCow]);
        Arrays.sort(array, myComparator);
        return array;
    }

    private void toString(int[][] array) {
        for (int[] matrix : array) {
            for (int cow = 0; cow < array.length; cow++) {
                if (matrix[cow] >= 0) {
                    System.out.print(" " + matrix[cow] + " ");

                } else {
                    System.out.print(matrix[cow] + " ");
                }
            }
            System.out.println();
        }
    }
}
