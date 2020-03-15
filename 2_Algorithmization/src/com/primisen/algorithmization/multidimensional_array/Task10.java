package com.primisen.algorithmization.multidimensional_array;

//Найти положительные элементы главной диагонали квадратной матрицы

public class Task10 {

    public static void main(String[] args) {

        int[][] matrix = {

                {-4, 5, 6, 5},
                {0, -4, 6, 9},
                {-3, 1, 2, 4},
                {7, -1, 6, 8}};

        System.out.print("Positive elements: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if(i == j && matrix[i][j] > 0) {

                    System.out.print(matrix[i][j] + "  ");
                }
            }
        }
    }
}