package com.company.leetCode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz {
    public static void main(String[] args) {
        extracted();
        anotherExtracted();
    }

    private static void anotherExtracted() {
        String result = Stream.iterate(1, i -> ++i)
                .limit(100)
                .map(i -> i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : "" + i)
                .collect(Collectors.joining("\n"));
        System.out.println(result);
    }

    private static void extracted() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                stringBuilder.append("Fizz");
            }
            if (i % 5 == 0) {
                stringBuilder.append("Bazz");
            }
            System.out.println(i % 3 == 0 | i % 5 == 0 ? stringBuilder.toString() : i);
            stringBuilder = new StringBuilder();
        }
    }
}
/*Напишите программу, которая выводит на экран числа от 1 до 100. При этом вместо чисел, кратных трем,
 программа должна выводить слово Fizz, а вместо чисел, кратных пяти — слово Buzz. Если число кратно пятнадцати,
  то программа должна выводить слово FizzBuzz. Задача может показаться очевидной,
   но нужно получить наиболее простое и красивое решение.*/