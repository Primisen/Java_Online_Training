package com.primisen.basics.branching;

// Найти max{min(a, b), min(c, d)}

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print("Enter a: ");

        double a = getDouble();

        double b;

        do {
            System.out.print("Enter b (b != a): ");

            b = getDouble();

        }while (a == b);

        System.out.print("Enter c: ");

        double c = getDouble();

        double d;

        do {
            System.out.print("Enter d (d != c): ");

            d = getDouble();

        }while (d == c);

        double minaAB = min(a, b);
        double minCD = min(c, d);

        double max = minaAB < minCD ? minCD : minaAB;

        System.out.println("Max{min(a,b), min(c,d)}: " + max);
    }

    private static double min(double a, double b){

        double min = 0;

        if (a < b){
            min = a;
        }
        if(a > b){
            min = b;
        }

        return min;
    }

    private static double getDouble (){

        Scanner sc = new Scanner(System.in);

        while(!sc.hasNextDouble()){

            System.out.println("The value is incorrect. Try again.");
            sc.next();
        }

        return sc.nextDouble();
    }
}