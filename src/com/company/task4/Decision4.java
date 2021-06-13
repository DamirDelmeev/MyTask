package com.company.task4;

import java.util.Scanner;

public class Decision4 {
    public static void main(String[] args) {
        Decision4 Obj = new Decision4();
        System.out.println(Obj.wordWithMinimalNumDiffLetters());
    }

    String wordWithMinimalNumDiffLetters() {
        System.out.println("Введите строку с любым количеством слов.Используйте символы английского алфавита.");
        Scanner scan1 = new Scanner(System.in);
        String line = scan1.nextLine();
        String words[] = line.split(" ");
        String result = null;
        int minSymbols = words[0].length();
        for (int i = 0; i < words.length; i++) {
            if (words[i].matches("\\w+\\s*")) {
                int amountUniqueSymbol = words[i].length();
                for (int j = 0; j < words[i].length(); j++) {
                    if (j != words[i].indexOf(words[i].charAt(j))) {
                        amountUniqueSymbol--;
                    }
                }
                if (amountUniqueSymbol < minSymbols | i == 0) {
                    minSymbols = amountUniqueSymbol;
                    result = (words[i]);
                }
            } else {
                System.out.println("Вы ввели недопустимый символ ,попробуйте ещё раз.");
                result = wordWithMinimalNumDiffLetters();
            }
        }
        return result;
    }
}


