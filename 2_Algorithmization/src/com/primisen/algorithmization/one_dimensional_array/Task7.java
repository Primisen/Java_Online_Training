package com.primisen.algorithmization.one_dimensional_array;

import java.util.Scanner;

/*
    Даны действительные числа a_1, a_2,.., a_2n.
    Найти max(a_1 + a_2n, a_2 + a_(2n-1),.., a_n + a_n+1).
 */
public class Task7 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n;

        do {

            System.out.print("Enter positive n: ");

            while (!sc.hasNextInt()) {
                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            n = sc.nextInt();

        }while (n <= 0);

        double [] array = new double[2*n];

        for (int i = 0; i < array.length; i++) {

            System.out.print("Enter " + i + " element of array: ");

            while (!sc.hasNextDouble()){

                System.out.println("Value is incorrect. Try again.");
                sc.next();
            }

            array[i] = sc.nextDouble();
        }

        int right = array.length/2;

        double maximumSum = array[0] + array[array.length - 1];

        for (int i = 0; i < array.length/2; i++) {

            if (maximumSum < array[i] + array[right]){

                maximumSum = array[i] + array[right];
            }

            right--;
        }

        System.out.println("Maximum sum = " + maximumSum);
    }
}