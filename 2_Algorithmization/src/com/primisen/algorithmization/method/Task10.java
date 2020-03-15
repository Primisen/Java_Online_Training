package com.primisen.algorithmization.method;

import java.util.Scanner;

/*
    Дано натуральное число N. Написать метод (методы) для формирования массива,
    элементами которого являются цифры числа N
 */
public class Task10 {

    public static void main(String[] args) {

        System.out.print("Enter N: ");
        int n = getInt();

        int sizeOfArray = countDigitsInNumber(n);

        printArray(numberInArray(n, sizeOfArray));
    }

    private static int countDigitsInNumber(int number){

        int count = 0;

        while (number > 0){

            number /= 10;

            count++;
        }

        return count;
    }

    public static int [] numberInArray(int number, int size){

        int [] array = new int [size];

        int index = size - 1;

        while (number > 0){

            array[index] = number % 10;
            number /= 10;
            index--;
        }
        return array;
    }

    public static void printArray(int [] array){

        for (int i = 0; i < array.length; i++){

            System.out.print(array[i] + " ");
        }
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