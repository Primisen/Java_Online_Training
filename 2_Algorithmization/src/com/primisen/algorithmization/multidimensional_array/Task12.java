package com.primisen.algorithmization.multidimensional_array;

// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

public class Task12 {

    public static void main(String[] args) {

        int[][] matrix = {
                {7, 0, -4, 2},
                {4, 3, 0, 1},
                {4, 6, 2, 0}};

        System.out.println("Sort ascending: ");

        for (int i = 0; i < matrix.length; i++) {    //сортировка строк по возрастанию

            boolean sorting = true;

            while (sorting) {

                sorting = false;

                for (int j = 0; j < matrix[i].length - 1; j++) {

                    if (matrix[i][j] > matrix[i][j + 1]) {

                        int buf = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;

                        sorting = true;
                    }
                }
            }
        }

        printMatrix(matrix);
        System.out.println();

        System.out.println("Sort descending: ");

        for (int i = 0; i < matrix.length; i++) { //сортировка строк по убыванию

            boolean sorting = true;

            while(sorting){

                sorting = false;

                for (int j = 0; j < matrix[i].length - 1; j++) {

                    if (matrix[i][j] < matrix[i][j + 1]){

                        int buf  = matrix[i][j];
                        matrix[i][j] = matrix[i][j + 1];
                        matrix[i][j + 1] = buf;

                        sorting = true;
                    }
                }
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int [][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf("% 3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
