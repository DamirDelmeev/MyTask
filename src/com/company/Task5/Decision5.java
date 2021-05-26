package com.company.Task5;

import java.util.Scanner;

public class Decision5 {
    public static void main(String[] args) {
        Decision5 Obj=new Decision5();
        System.out.println("CountWords: "+Obj.countWordsWithSameNumVowelsAndConsonants());
    }

    int countWordsWithSameNumVowelsAndConsonants() {
        System.out.println("Введите строку с любым количеством слов.");
        Scanner scan1=new Scanner(System.in);
        String line=scan1.nextLine();
        String words[]=line.split(" ");
        int vowel=0;
        int consonant=0;
        int countWords = 0;
        for (int i=0;i<words.length;i++) {
            if (!words[i].matches("\\w+\\s*")) {
                words[i] = null;
            }
            if (words[i] == null) {continue;}
                for (int j = 0; j < words[i].length(); j++) {
                    if (words[i].charAt(j) == 'a' || words[i].charAt(j) == 'e' || words[i].charAt(j) == 'i' ||
                            words[i].charAt(j) == 'o' || words[i].charAt(j) == 'u' || words[i].charAt(j) == 'A' ||
                            words[i].charAt(j) == 'E' || words[i].charAt(j) == 'I' || words[i].charAt(j) == 'O' ||
                            words[i].charAt(j) == 'U') {
                        vowel++;
                    } else {
                        consonant++;
                    }
                }
            //    System.out.println("vowel" + vowel);
            //    System.out.println("consonant" + consonant);
                if (consonant == vowel) {
                    countWords++;
                }
                consonant = 0;
                vowel = 0;
        }
        return countWords;
    }
}
