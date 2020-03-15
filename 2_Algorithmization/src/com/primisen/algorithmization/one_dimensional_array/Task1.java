package com.primisen.algorithmization.one_dimensional_array;

/*
    В массив A[N] занесены натуральные числа.
    Найти сумму тех элементов, которые кратны данному К.
*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = 0;

        do {
            System.out.print("Enter a positive K: ");

            while (!sc.hasNextInt()) {
                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            k = sc.nextInt();

        } while (k <= 0);

        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for (int elementOfArray : array) {

            if (elementOfArray % k == 0) {
                sum += elementOfArray;
            }
        }
        System.out.print("Sum: " + sum);
    }
}
