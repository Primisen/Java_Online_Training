package com.primisen.algorithmization.method;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
возведенная в степень, равную количеству его цифр, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
использовать декомпозицию.
 */

public class Task14 {

    public static void main(String[] args) {

        int k = 800;

        for (int i = 1; i < k; i++) {

            if (numberArmstrong(i, numberOfDigits(i)) == i){

                System.out.print(i + " ");
            }
        }
    }

    private static int numberOfDigits(int number){

        int numberOfDigits = 0;

        while (number != 0){

            number /= 10;
            numberOfDigits++;
        }

        return numberOfDigits;
    }

    private static int numberArmstrong(int number, int exponent){

        int sum = 0;

        while (number!= 0){

            sum += Math.pow(number % 10, exponent);

            number /=10;
        }

        return sum;
    }
}
