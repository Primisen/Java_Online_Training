package com.primisen.basics.branching;

// Вычислить значение функции

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");

        while (!sc.hasNextDouble()){

            System.out.println("The value is incorrect.");
            sc.next();
        }

        double x = sc.nextDouble();

        double mathFunction = 0;

        if (x > 3) {
            if((Math.pow(x, 3) + 6) != 0) {

                mathFunction = 1 / (Math.pow(x, 3) + 6);

            } else if((Math.pow(x, 3) + 6) == 0){

                System.out.println("Operation not possible.");
            }

        } else if (x <= 3) {

            mathFunction = Math.pow(x, 2) - 3 * x + 9;
        }

        System.out.println("The result: " + mathFunction);
    }
}