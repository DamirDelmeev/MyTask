package com.company.Task1;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Decision1 {
    public static void main(String[] args) {
        Decision1 obj=new Decision1();
        obj.amountLine(obj.menu());
        obj.inMaxMin();
    }
    int choice=0;
    private int menu(){
        try{
            System.out.println("Выберите вариант определяющий количество строк,указав число.");
            System.out.println("1.Рандомное количество строк от 1 до 100.");
            System.out.println("2.Задать число строк самостоятельно.");
            Scanner scan=new Scanner(System.in);
            choice=scan.nextInt();

        }catch (NoSuchElementException e){
            System.out.println("Ошибочный символ.");
        }
        return choice;
    }

    int amount=0;
    private int amountLine(int choice){

        switch (choice){
            case 1 :
                Random rnd=new Random();
                amount= rnd.nextInt(99)+1;
                System.out.println("Количество строк ,которое вы напишите="+amount+".");
                break;

            case 2 :
                try{
                    System.out.println("Введите количество строк,которое вы хотели бы записать.");
                    Scanner scan2=new Scanner(System.in);
                    amount=scan2.nextInt();
                    if(amount<=0||amount>=100){
                        System.out.println("Ошибочный символ.Давайте попробуем ещё раз.");
                        amountLine(menu());}
                    else{
                        System.out.println("Количество строк ,которое вы напишите="+amount+".");
                    }
                }catch (NoSuchElementException e){
                    System.out.println("Ошибочный символ.Давайте попробуем ещё раз.");
                    amountLine(menu());
                }
                break;

            default:
                System.out.println("Вы ошиблись.Повторите попытку.\n");
                amountLine(menu());
                break;
        }
        return amount;
    }

    private void inMaxMin(){
        int counterLine=0;
        String maxLine=null;
        String minLine=null;
        int max=0;
        int min=0;
        do {
            Scanner scan3 = new Scanner(System.in);
            String Line = scan3.nextLine();
            if(counterLine==0){
                max= Line.length();
                min=Line.length();
            }
            int counterCh=0;
            for (;counterCh<Line.length();counterCh++){
            }
            if(counterCh<=min){
                min=counterCh;
                minLine=Line;}
            if(counterCh>=max){
                max=counterCh;
                maxLine=Line;}
            counterLine++;
        }while (counterLine!=amount);
        System.out.println("Длина минимальной строки="+min+". Строка:'"+minLine+"'");
        System.out.println("Длина максимальной строки="+max+". Строка:'"+maxLine+"'");
    }

}
