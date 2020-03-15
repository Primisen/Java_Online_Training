package com.primisen.basics.linear;

// Вычислить значение выражения по формуле (все переменные принимают действительные значения)

import java.util.Scanner;

import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {

        //подразумевается ввод значение в градусах. затем в программе они переводятся в радианы для правильного вычисления

        System.out.print("Enter x: ");
        double x = getDouble();

        System.out.print("Enter y: ");
        double y = getDouble();

        if (cos(toRadians(x) - sin(toRadians(y))) == 0){ //знаменатель равен нулю
            System.out.println("Error: divider is zero.");
        }

        double val = (sin(toRadians(x)) + cos(toRadians(y))) / (cos(toRadians(x)) - sin(toRadians(y))) * tan(toRadians(x * y));

        System.out.println("The result of the expression: " + val);
    }

    private static double getDouble() {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextDouble()) {

            System.out.println("The value is incorrect. Try again.");
            sc.next();
        }

        return sc.nextInt();
    }
}