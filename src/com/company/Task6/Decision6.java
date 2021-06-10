package com.company.Task6;

import java.util.Scanner;

public class Decision6 {
    public static void main(String[] args) {
        Decision6 obj = new Decision6();
        System.out.println(obj.inPutAndFindWord());

    }

    private String inPutAndFindWord() {
        String memoryWord = null;
        System.out.println("Введите любое количество слов. ");
        Scanner scan1 = new Scanner(System.in);
        String line = scan1.nextLine();
        String[] words = line.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 1) {
                words[i] = null;
            }
            int counter = 0;
            for (int j = 0; j < words[i].length() - 1; j++) {

                if (words[i].charAt(j) < words[i].charAt(j + 1)) {
                    counter++;
                    if (counter == words[i].length() - 1) {
                        memoryWord = words[i];
                        return memoryWord;
                    }
                }
            }

        }
        return "NOT FOUND";
    }
}



