package com.primisen.algorithmization.multidimensional_arrays;

import java.util.Scanner;

/*
    Дана матрица.
    Вывести к-ю строку и р-ый столбец матрицы.
 */
public class Task3 {
    
     public static void main(String[] args) {

        int row = 2;

        int column = 1;

        int[][] matrix = {
                {1, 2, 3, 10},
                {4, 5, 6, 11},
                {7, 8, 9, 12}};

        System.out.print(row + " row: ");
        for (int j = 0; j < matrix[row].length; j++) { //вывод строки

            System.out.print(matrix[row][j] + " ");
        }

        System.out.println();

        System.out.print(column + " column: ");
        for (int i = 0; i < matrix.length; i++) {   //вывод столбца

            System.out.print(matrix[i][column] + " ");
        }
    }
}
