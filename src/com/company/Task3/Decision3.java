package com.company.Task3;

import java.util.*;

public class Decision3  {


    public static void main(String[] args) {
        Decision3 MyDecision3=new Decision3();
        MyDecision3.showNumberOfLines(MyDecision3.showMenu());
        MyDecision3.inputLinesAndShowAverage();


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
            showMenu();
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
                        System.out.println("Ошибочный символ.Попробуйте ещё раз.");
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

    void inputLinesAndShowAverage() {
        String Line[]=new String[numberOfLines];
        int arrayLength[]=new int[Line.length];
        int counter = 0;

        do {
            Scanner scan3 = new Scanner(System.in);
            Line[counter] = scan3.nextLine();
            arrayLength[counter]=Line[counter].length();
            counter++;
        }while (counter != numberOfLines) ;

        int result=0;
        for (int c:arrayLength){
            result+=c;
        }
        int average=result/arrayLength.length;
        //System.out.println("Total"+result);
        System.out.println("Average: "+average);

        for(String x:Line)
            if(x.length()<average)
            System.out.println("("+x.length()+"): "+x);

    }
}

