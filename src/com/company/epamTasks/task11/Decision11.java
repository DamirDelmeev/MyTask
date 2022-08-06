package com.company.epamTasks.task11;

import java.util.LinkedList;
import java.util.Scanner;

public class Decision11 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        int numbers = scan1.nextInt();
        System.out.println(extracted1(numbers, 0));
    }

    private static int extracted1(int number, int result) {
        LinkedList<Integer> list = new LinkedList<>();
        while (number != 0) {

            list.push(number % 10);
            number = number / 10;
            result += list.get(0);
            list.remove(0);
            result = extracted1(number, result);
            return result;
        }
        return result;
    }
}

