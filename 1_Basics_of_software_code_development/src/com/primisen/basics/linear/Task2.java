package com.primisen.basics.linear;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print("Enter a: ");
        double a = getDouble();

        System.out.print("Enter b: ");
        double b = getDouble();

        System.out.print("Enter c: ");
        double c = getDouble();

        if (a == 0) {  //делитель равен нулю
            System.out.println("Error: divider is zero. Try again.");
        }

        if ((Math.pow(b, 2) + 4 * a * c) < 0) {  //отрицательное значение под кв. корнем
            System.out.println("Error: square root is negative. Try again.");

        } else {
            double val = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c) + Math.pow(b, -2);

            System.out.println("The result of the expression = " + val);
        }
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
