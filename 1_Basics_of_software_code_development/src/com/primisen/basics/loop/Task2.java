package com.primisen.basics.loop;

//Вычислить значения функции на отрезке [а,b] c шагом h

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){

        System.out.println("Enter a: ");
        int beginOfLine = getInt();

        System.out.println("Enter b: ");
        int endOfLine = getInt();

        System.out.println("Enter h: ");
        int step = getInt();

        int startPoint = beginOfLine;

        System.out.println("x    y");

        if (beginOfLine < endOfLine) { //если отрезок слева направо

            while (startPoint <= endOfLine) {

                mathFunction(startPoint);
                startPoint += step;
            }
        }
        if (beginOfLine > endOfLine){ //если отрезок справа налево

            while (startPoint >= endOfLine) {

                mathFunction(startPoint);
                startPoint -= step;
            }
        }
        if (beginOfLine == endOfLine){

            mathFunction(startPoint);
        }
    }

    private static void mathFunction(int x){

        int function = 0;

        if (x > 2) {
            function = x;
        }

        if (x <= 2) {
            function = -x;
        }

        System.out.println(x + "    " + function);
    }

    private static int getInt() {

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {

            System.out.println("The value is incorrect. Try again.");
            sc.next();
        }

        return sc.nextInt();
    }
}