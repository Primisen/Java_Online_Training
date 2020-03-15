package com.primisen.basics.loop;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:
*/

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args){

        System.out.println("Enter positive value, please.");

        System.out.print("Enter n: ");
        double n = getDouble();

        System.out.print("Enter e: ");
        double e = getDouble();

        double sum = 0;
        double an; //a_n

        for (int i = 0; i <= n; i++) {

            an = 1/Math.pow(2, i) + 1/Math.pow(3, i);

            if (Math.abs(an) >= e) {

                sum += an;
            }
        }

        System.out.println(sum);
    }

    private static double getDouble (){

        Scanner sc = new Scanner(System.in);

        double value;

        do {

            while (!sc.hasNextDouble()) {

                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            value = sc.nextDouble();

        }while (value <= 0);

        return value;
    }
}