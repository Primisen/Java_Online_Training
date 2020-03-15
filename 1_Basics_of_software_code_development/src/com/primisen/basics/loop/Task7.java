package com.primisen.basics.loop;

/*
    Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.
*/

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args){

        System.out.println("Enter positive value, please.");

        System.out.print("Enter m: ");
        int m = getInt();

        System.out.print("Enter n: ");
        int n = getInt();

        for(int i = m; i <= n ; i++){

            for (int j = i; j > 1; j--) {

                if (i % j == 0 && i != j) {

                    System.out.println("Divider of " + i + (": ") + j);
                }
            }
        }
    }

    private static int getInt() {

        Scanner sc = new Scanner(System.in);

        int number = 0;

        do {

            while (!sc.hasNextInt()) {

                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            number = sc.nextInt();

        }while (number <= 0);

        return number;
    }
}