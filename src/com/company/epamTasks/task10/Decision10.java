package com.company.epamTasks.task10;

import java.util.Scanner;

public class Decision10 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int value = scan1.nextInt();
        String answer = (findIt(value)) ? "YES" : "NO";
        System.out.println(answer);
    }

    private static boolean findIt(int value) {
        for (int i = 1; i <= value; i = i * 2) {
            String valueString = Integer.toBinaryString(value);
            String iString = Integer.toBinaryString(i);
            if (valueString.compareTo(iString) == 0) {
                return true;
            }
        }
        return false;
    }
}
