package com.primisen.basics.loop;

/*
Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
все числа от 1 до введенного пользователем числа
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numebr = 0;

        do{

            System.out.print("Enter positive n: ");

            while (!sc.hasNextInt()){

                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            numebr = sc.nextInt();

        }while (numebr <= 0);

        int sum = 0;

        for (int i = 1; i <= numebr; i++){

            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}
