package com.company.task18;

import java.io.IOException;
import java.util.*;

public class Decision18 {
    public static void main(String[] args) throws IOException {
        Integer[][] userMatrix = putIn();
        int maxValue = findMaxValue(userMatrix);
        System.out.println("Максимальное значение из матрицы: " + maxValue);
        if (userMatrix.length != 1) {
            Integer[][] newMatrix = findNewMatrixShowSize(userMatrix, maxValue);
            if (newMatrix != null) {
                toString(newMatrix);
            } else {
                System.out.print("Единственный элемент матрицы: "+userMatrix[0][0]);
            }
        } else {
            toString(userMatrix);
        }
    }

    private static Integer[][] findNewMatrixShowSize(Integer[][] userMatrix, int maxValue) {
        HashSet<Integer> iSet = new HashSet<>();
        HashSet<Integer> jSet = new HashSet<>();
        for (int i = 0; i < userMatrix.length; i++) {
            for (int j = 0; j < userMatrix.length; j++) {
                if (userMatrix[i][j] == maxValue) {
                    if (!iSet.contains(i)) {
                        iSet.add(i);
                    }
                    if (!jSet.contains(j)) {
                        jSet.add(j);
                    }
                }
            }
        }
        if (userMatrix.length - iSet.size() == 0 | userMatrix.length - jSet.size() == 0) {
            Integer newMatrix[][] = null;
            return newMatrix;
        }
        System.out.println("Количество строк новой матрицы: " + (userMatrix.length - iSet.size()));
        System.out.println("Количество столбцов новой матрицы: " + (userMatrix.length - jSet.size()));

        return removeLines(userMatrix, iSet, jSet);
    }

    private static Integer[][] removeLines(Integer[][] userMatrix, HashSet<Integer> iSet, HashSet<Integer> jSet) {
        Integer[][] newMatrix = new Integer[userMatrix.length - iSet.size()][userMatrix.length - jSet.size()];
        int iForNewMatrix = 0;
        for (int i = 0; i < userMatrix.length; i++) {

            if (iSet.contains(i)) {
                continue;
            }
            int jForNewMatrix = 0;
            for (int j = 0; j < userMatrix.length; j++) {
                if (jSet.contains(j)) {
                    continue;
                }
                newMatrix[iForNewMatrix][jForNewMatrix] = userMatrix[i][j];
                jForNewMatrix++;
            }
            iForNewMatrix++;
        }
        return newMatrix;
    }

    private static int findMaxValue(Integer[][] userMatrix) {
        List<Integer> checkMax = new ArrayList<>();
        for (int i = 0; i < userMatrix.length; i++) {
            List<Integer> list = Arrays.asList(userMatrix[i]);
            checkMax.add(Collections.max(list));
        }
        return (Collections.max(checkMax));
    }

    private static Integer[][] putIn() {
        System.out.println("Введите размерность матрицы.");
        Scanner scan1 = new Scanner(System.in);
        int dimension = scan1.nextInt();
        System.out.println("Заполните матрицу.");
        Integer[][] userMatrix = new Integer[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                userMatrix[i][j] = scan1.nextInt();
            }
        }
        return userMatrix;
    }

    public static void toString(Integer arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            for (int cow = 0; cow < arr[row].length; cow++) {
                if (arr[row][cow] >= 0) {
                    System.out.print(" " + (int) arr[row][cow] + " ");
                }
                if (arr[row][cow] < 0) {
                    System.out.print((int) arr[row][cow] + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
