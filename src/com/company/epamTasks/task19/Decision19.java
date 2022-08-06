package com.company.epamTasks.task19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Decision19 {
    public static void main(String[] args) {
        Integer[][] userMatrix = putIn();
        List<Integer> removeList = getRemoveList(userMatrix);
        Integer[][] newMatrixWithoutCows = removeCows(userMatrix, removeList);
        List<Integer> secondRemoveList = getRemoveList(newMatrixWithoutCows);
        Integer[][] newMatrixWithoutRows = removeRows(newMatrixWithoutCows, secondRemoveList);
        System.out.println("Количество строк новой матрицы: " + (newMatrixWithoutRows.length));
        System.out.println("Количество столбцов новой матрицы: " + (newMatrixWithoutRows[0].length));
        System.out.println("Результат");
        toString(newMatrixWithoutRows);
    }

    private static List<Integer> getRemoveList(Integer[][] userMatrix) {
        List<Integer> removeList = new ArrayList<>();
        for (int i = 0; i < userMatrix.length; i++) {
            removeList.add(0);
        }
        return removeList;
    }

    private static Integer[][] removeCows(Integer[][] userMatrix, List<Integer> removeList) {
        int removeCow = 0;
        for (int i = 0; i < userMatrix.length; i++) {
            List<Integer> list = new ArrayList();
            for (Integer[] matrix : userMatrix) {
                list.add(matrix[i]);
            }
            if (containsAll(list, removeList)) {
                removeCow++;
            }
        }
        Integer[][] newMatrixWithoutCows = new Integer[userMatrix.length][userMatrix.length - removeCow];
        int counter = 0;
        for (int i = 0; i < userMatrix[0].length; i++) {
            List<Integer> list = new ArrayList();
            for (Integer[] matrix : userMatrix) {
                list.add(matrix[i]);
            }
            if (containsAll(list, removeList)) {
                list.clear();
            } else {
                for (int k = 0; k < newMatrixWithoutCows.length; k++) {
                    newMatrixWithoutCows[k][counter] = list.get(k);
                }
                counter++;
            }
        }
        return newMatrixWithoutCows;
    }

    private static Integer[][] removeRows(Integer[][] userMatrix, List<Integer> removeList) {
        int removeRow = 0;
        for (Integer[] matrix : userMatrix) {
            List<Integer> list = new ArrayList<>(Arrays.asList(matrix));
            if (containsAll(list, removeList)) {
                removeRow++;
            }
        }
        int counterRow = 0;
        Integer[][] newMatrix = new Integer[userMatrix.length - removeRow][userMatrix[0].length];
        for (Integer[] matrix : userMatrix) {
            List<Integer> list = new ArrayList<>(Arrays.asList(matrix));
            if (containsAll(list, removeList)) {
                list.clear();
                continue;
            }
            list.toArray(newMatrix[counterRow]);
            counterRow++;
        }
        return newMatrix;
    }

    static boolean containsAll(List userList, List removeList) {
        int result = 0;
        for (Object o : userList) {
            if (o == removeList.get(0)) {
                result++;
            }
        }
        return result == userList.size();
    }

    private static Integer[][] putIn() {
        System.out.println("Введите размерность матрицы.");
        Scanner scan1 = new Scanner(System.in);
        int dimension = scan1.nextInt();
        Integer[][] UserMatrix = new Integer[dimension][dimension];
        System.out.println("Заполните матрицу.");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                UserMatrix[i][j] = scan1.nextInt();
            }
        }
        return UserMatrix;
    }

    public static void toString(Integer arr[][]) {
        for (Integer[] integers : arr) {
            for (Integer integer : integers) {
                if (integer >= 0) {
                    System.out.print(" " + (int) integer + " ");
                }
                if (integer < 0) {
                    System.out.print((int) integer + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
