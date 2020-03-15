package com.primisen.algorithmization.method;

//     Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.print("Enter first number: ");
        int a = getInt();

        System.out.print("Enter second number: ");
        int b = getInt();

        System.out.print("Enter third number: ");
        int c = getInt();

        System.out.print("Enter fourth number: ");
        int d = getInt();

        System.out.print("NOD = " + nod(nod(a, b), nod(c, d)));
    }
    public static int nod(int a, int b){

        int buf;

        while (a % b != 0){
            buf = b;
            b = a % b;
            a = buf;
        }
        return b;
    }

    private static int getInt(){

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()){

            System.out.println("The value is incorrect. Try again.");
            sc.next();
        }

        return sc.nextInt();
    }
}