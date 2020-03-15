package com.primisen.basics.linear;

//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.print("Enter a: ");
        double a = getDouble();

        System.out.print("Enter b: ");

        double b = getDouble();

        System.out.print("Enter c: ");

        double c = getDouble();

        double z = (((a - 3) * b / 2) + c);

        System.out.println("z = " + z);
    }

    private static double getDouble() {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextDouble()) {

            System.out.println("The value is incorrect. Try again.");
            sc.next();
        }

        return sc.nextDouble();
    }
}