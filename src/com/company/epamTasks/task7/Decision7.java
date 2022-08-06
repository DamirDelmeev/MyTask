package com.company.epamTasks.task7;

import java.util.ArrayList;
import java.util.Scanner;

public class Decision7 {
    public static void main(String[] args) {
        Decision7 obj = new Decision7();
        obj.inPutShow();
    }

    private void inPutShow() {
        System.out.println("Введите любое количество слов.");
        Scanner scan1 = new Scanner(System.in);
        String line = scan1.nextLine();
        String[] words = line.split(" ");

        ArrayList<String> ResultWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!(words[i].matches("^[a-zA-Z//-]+[//,]??"))) {
                words[i] = null;
            }
            if (words[i] != null) {
                words[i] = findDifferentSymbols(words[i]);
            }
            if (words[i] != null) {
                ResultWords.add(words[i]);
            }
        }
        for (int i = 0; i < ResultWords.toArray().length; i++) {
            if (i != ResultWords.indexOf(ResultWords.get(i))) {
                ResultWords.remove(i);
            }
        }
        for (String s : ResultWords) {
            System.out.println(s);
        }
    }

    private static String findDifferentSymbols(String word) {

        for (int i = 0; i < word.length(); i++) {
            if (i != word.indexOf(word.charAt(i))) {
                return null;
            }
        }
        return word;
    }
}
