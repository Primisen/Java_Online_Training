package com.primisen.basics.linear;
/*
    Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
    данное значение длительности в часах, минутах и секундах в следующей форме:
    ННч ММмин SSc
*/

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int time;
        do{
            System.out.print("Enter positive t (second): ");

            while (!sc.hasNextInt()){

                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            time = sc.nextInt();

        }while (time < 0);

        int hours = time / 3600;

        //при делении на 3600 подразумевлся какой-то остаток,
        //его мы и будем распределять на минуты
        int remainder = time - hours * 3600;
        int minutes = remainder / 60;

        //то, что осталось от нахождения минут и есть секунды
        int seconds = remainder - minutes * 60;

        System.out.printf("%02dч %02dмин %02dс", hours, minutes, seconds);
    }
}
