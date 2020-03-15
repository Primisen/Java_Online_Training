package com.primisen.algorithmization.method;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m
 */

public class Task8 {

    public static void main(String[] args) {

        int[] array = {4, 8, 0, 2, 6, 4, 7, 7, 1};
    
        int k;
        int m;

        //part 1
        k = 1;
        m = 3;
        System.out.print("Sum for " + k + " to " + m + " = " + sum(array, k, m));
        System.out.println();

        //part 2
        k = 3;
        m = 5;
        System.out.print("Sum for " + k + " to " + m + " = " + sum(array, k, m));
        System.out.println();

        //part 3
        k = 4;
        m = 6;
        System.out.print("Sum for " + k + " to " + m + " = " + sum(array, k, m));
        System.out.println();
    }

    private static int sum(int[] array, int k, int m) {

        int sum = 0;

        for (int i = k; i <= m; i++) {
            sum += array[i];
        }

        return sum;
    }
}
