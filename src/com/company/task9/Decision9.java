package com.company.task9;

import java.util.Scanner;

public class Decision9 {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Введите три целых числа.");
        int a = scan1.nextInt();
        int b = scan1.nextInt();
        int c = scan1.nextInt();

        double discriminant = findDiscriminant(a, b, c);
        if (discriminant > 0) {
            double firstRoot = (-b - Math.sqrt(discriminant)) / (double) (2 * a);
            double secondRoot = (-b + Math.sqrt(discriminant)) / (double) (2 * a);
            System.out.print(String.format("%.2f", firstRoot).replace(",", "."));
            System.out.print(", ");
            System.out.print(String.format("%.2f", secondRoot).replace(",", "."));
        }
        if (discriminant == 0) {
            double firstRoot = (double) (-b) / (double) (2 * a);
            System.out.println(String.format("%.2f", firstRoot).replace(",", "."));
        }
        if (discriminant < 0) {
            System.out.println("NO ROOTS");
        }
    }

    private static double findDiscriminant(int a, int b, int c) {
        return (b * b) - (4 * a * c);
    }

}

