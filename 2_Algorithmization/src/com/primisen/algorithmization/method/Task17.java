package com.primisen.algorithmization.method;

/*
Из заданного числа вычесть сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. Сколько таких
действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Task17 {

    public static void main(String[] args) {

        int n = 50;

        System.out.println("n = " + n);
        System.out.println("Number of subtraction = " + numberOfSubtraction(n));
    }

    private static int sumOfDigitsOnNumber(int number){

        int sum = 0;

        while (number != 0){

            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    private static int numberOfSubtraction(int number) {

        int counter = 0;

        while (number != 0) {

            number -= sumOfDigitsOnNumber(number);
            counter++;
        }

        return counter;
    }
}
