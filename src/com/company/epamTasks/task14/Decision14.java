package com.company.epamTasks.task14;

import java.util.Scanner;

public class Decision14 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int size = scan1.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan1.nextInt();
        }
        System.out.println(findIncreasingSequence(array));
    }

    static int findIncreasingSequence(int array[]) {
        int finalResult = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                if (array[i] + 1 == array[i + 1]) {
                    result++;
                    if (finalResult < result) {
                        finalResult = result;
                    }
                } else {
                    result = 0;
                }
            }
        }
        if (finalResult == 0) {
            return 0;
        }
        return finalResult + 1;
    }
}