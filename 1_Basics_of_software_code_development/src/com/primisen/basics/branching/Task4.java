package com.primisen.basics.branching;

// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через
//отверстие.

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        System.out.println("Enter positive value, please.");

        System.out.print("Enter А: ");
        int a = getInt();

        System.out.print("Enter B: ");
        int b = getInt();

        System.out.print("Enter x: ");
        int x = getInt();

        System.out.print("Enter y: ");
        int y = getInt();

        System.out.print("Enter z: ");
        int z = getInt();

        if ((x <= a) && (y <= b || z <= b)) {

            System.out.println("Success.");

        } else if ((y <= a) && (x <= b || z <= b)) {

            System.out.println("Success.");

        } else if ((z <= a) && (x <= b || y <= b)) {

            System.out.println("Success.");

        } else {

            System.out.println("Failure. Try again.");
        }
    }

    private static int getInt() {

        Scanner sc = new Scanner(System.in);

        int value;

        do {

            while (!sc.hasNextInt()) {

                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            value = sc.nextInt();
        }while (value <= 0);

        return value;
    }
}