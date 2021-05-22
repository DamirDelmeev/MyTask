package com.company.Task2;

import java.util.*;

public class Decision2 implements Comparator<String>  {


    public static void main(String[] args) {
        Decision2 MyDecision = new Decision2();

        MyDecision.showNumberOfLines(MyDecision.showMenu());
        MyDecision.inputLines();
    }

    private int UserChoice = 0;
    int showMenu() {
        System.out.println("Выберите вариант определяющий количество строк,указав число.");
        System.out.println("1.Рандомное количество строк от 1 до 100.");
        System.out.println("2.Задать число строк самостоятельно.");
        try {
            Scanner scan1 = new Scanner(System.in);
            UserChoice = scan1.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ошибочный символ.");
        }
        return UserChoice;
    }

    private int numberOfLines = 0;
    int showNumberOfLines(int UserChoice) {
        switch (UserChoice) {
            case 1:
                Random amountLines = new Random();
                numberOfLines = amountLines.nextInt(99) + 1;
                System.out.println("Количество строк ,которое вы напишите=" + numberOfLines + ".");
                break;

            case 2:
                System.out.println("Введите количество строк,которое вы хотели бы записать.");
                try {
                    Scanner scan2 = new Scanner(System.in);
                    numberOfLines = scan2.nextInt();
                    if (numberOfLines < 0 || UserChoice > 100) {
                        System.out.println("Ошибочный симвdол.Попробуйте ещё раз.");
                        System.out.println();
                        showNumberOfLines(showMenu());
                        break;
                    } else System.out.println("Количество строк ,которое вы напишите=" + numberOfLines + ".");
                } catch (InputMismatchException e) {
                    System.out.println("Ошибочный символ.Попробуйте ещё раз.");
                    System.out.println();
                    showNumberOfLines(showMenu());
                }
                break;

            default:
                System.out.println("Ошибочный символ.Попробуйте ещё раз.");
                System.out.println();
                showNumberOfLines(showMenu());
                break;
        }
        return numberOfLines;
    }

    void inputLines() {
        String Line[]=new String[numberOfLines];
        int counter = 0;
        do {
            Scanner scan3 = new Scanner(System.in);
            Line[counter] = scan3.nextLine();
            counter++;
        }while (counter != numberOfLines) ;

        Arrays.sort(Line,new Decision2());
        /*Arrays.sort(Line, (i1, i2) -> i1.length() == i2.length()
        ? i1.compareTo(i2) : Integer.compare(i1.length(), i2.length()));*/
        for(String x:Line)
            System.out.println("("+x.length()+"): "+x);

    }

    public int compare(String o1, String o2) {
        if(o1.length()==o2.length()){
            return o1.compareTo(o2);
        }
        return Integer.compare(o1.length(),o2.length());
    }
    }
/