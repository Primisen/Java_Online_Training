package com.primisen.algorithmization.multidimensional_array;

/*
    Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    столбец содержит максимальную сумму.
 */
public class Task9 {

    public static void main(String[] args) {

        int [][] matrix = {
                {6, 0, 9, 5},
                {3, 9, 5, 5,},
                {1, 7, 8, 0}};

        int [] sumOfColumn = new int [matrix[0].length];

        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {

                sumOfColumn[j] += matrix[i][j];
            }
        }

        int max = sumOfColumn[0];

        for (int i = 1; i < sumOfColumn.length; i++) {

            if (max < sumOfColumn[i]){

                max = sumOfColumn[i];
            }
        }

        for (int i = 0; i < sumOfColumn.length; i++) {

            System.out.println("Sum of " + i + " column: " + sumOfColumn[i]);
        }

        System.out.println("Max: " + max);
    }
}
