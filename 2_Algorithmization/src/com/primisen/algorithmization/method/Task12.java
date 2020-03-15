package com.primisen.algorithmization.method;

/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
являются числа, сумма цифр которых равна К и которые не большее N
 */
public class Task12 {

    public static void main(String[] args) {

        int k = 3;
        int n = 600;

        printArray(array(k, n));
    }

    private static int [] array(int k, int n){

        int sum = 0;
        int count = 0;
        int j = 0;

        while (j < n) {

            while (sum != k) {

                sum = sumOfDigits(j);
                j++;
            }
            sum = 0;

            count++;
        }

        int [] array = new int[--count];

        j = 0;
        sum = 0;

        for (int i = 0; i < array.length; i++) {

            while (sum != k) {

                sum = sumOfDigits(j);
                j++;
            }
            sum = 0;

            array[i] = --j;

            j++;
        }

        return array;
    }

    private static int sumOfDigits(int number){

        int sum = 0;

        while (number != 0){

            sum += number % 10;

            number /= 10;
        }

        return sum;
    }

    private static void printArray(int [] array){

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}
