package Task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Decision8 {
    public static void main(String[] args) {
        System.out.println("Введите любое количество слов.");
        Scanner scan1 = new Scanner(System.in);
        String line = scan1.nextLine();
        String[] wordsAndNumbers = line.split(" ");
        List<String> NumberList = new ArrayList<>();
        for (int i = 0; i < wordsAndNumbers.length; i++) {
            if (!wordsAndNumbers[i].matches("[a-zA-Z0-9]+")) {
                wordsAndNumbers[i] = null;

            }
            if (wordsAndNumbers[i]!=null) {
            String[] interimArray = wordsAndNumbers[i].split("\\D+");
                for (String s : interimArray) {
                    if (s.matches("[0-9]+")) {
                        NumberList.add(s);
                    }
                }
        }
    }
        int palindromeCounter =0;
        for (String s : NumberList) {
            if (findPalindrome(s)) {
                palindromeCounter++;
                if (palindromeCounter == 2) {
                    System.out.println(s);
                }
            }
        }
        if(palindromeCounter==1) {
            System.out.println(NumberList.get(0));
        }
    }

    static boolean findPalindrome(String S){
        int max=S.length()-1;
        for(int i=0;i<S.length()/2;i++){
            if(S.charAt(i)!=S.charAt(max-i)){
                return false;
            }
        }
        return true;
    }
}
