package com.primisen.algorithmization.method;

//     Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <=9; i++){

            if (i % 2 != 0){

                sum += factorial(i);
            }
        }

        System.out.print("Answer: " + sum);
    }

    private static int factorial (int number){

        int factorialOfNumber = 1;

        for (int i = 1; i <= number; i++){

            factorialOfNumber *= i;
        }

        return factorialOfNumber;
    }
}