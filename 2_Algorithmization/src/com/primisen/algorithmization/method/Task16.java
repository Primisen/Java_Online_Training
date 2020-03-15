package com.primisen.algorithmization.method;

import static com.primisen.algorithmization.method.Task15.setSizeOfNumber;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Task16 {

    public static void main(String[] args) {

        int n = 1;

        int sum = sumOfElements(n);

        System.out.println("Sum = " + sum);

        System.out.println("The numbers of even digits = " + theNumberOfEvenDigits(sum));
    }

    public static boolean checkDigitsOnNumber(int number){  //проверка числа на данное условие

        boolean oddNumber = true; //нечетное число

        while (number != 0 && oddNumber) {

            int digit = number % 10;

            if (digit % 2 == 0) {

                oddNumber = false;
            }

            number /= 10;
        }

        return oddNumber;
    }

    private static int sumOfElements(int n ){

        int sum = 0;

        for (int i = setSizeOfNumber(n); i < setSizeOfNumber(n) * 10; i++) {

            if(checkDigitsOnNumber(i)){

                sum += i;
            }
        }

        return sum;
    }

    private static int theNumberOfEvenDigits(int number){  //количество четных цифр

        int counter = 0;

        while (number != 0){

            if (number % 2 == 0){

                counter++;
            }

            number /= 10;
        }

        return counter;
    }
}
