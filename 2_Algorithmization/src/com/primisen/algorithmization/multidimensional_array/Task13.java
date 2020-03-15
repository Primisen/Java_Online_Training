package com.primisen.algorithmization.multidimensional_array;

// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {

    public static void main(String[] args) {

        int [][]matrix = {
                {1 ,  3 , 4},
                {-7,  7 , 1},
                {4 , -3 , 9},
                {10,  4 ,-2}};

        //сортировка по возрастанию
        for (int i = 0; i < matrix[0].length; i++) {

            boolean sorting = true;

            while (sorting){

                sorting = false;

                for (int j = 0; j < matrix.length - 1; j++) {

                    if (matrix[j][i] > matrix[j + 1][i]){

                        int buf = matrix[j][i];
                        matrix[j][i] = matrix[j + 1][i];
                        matrix[j + 1][i] = buf;

                        sorting = true;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {   //вывод на экран
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf("% 4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //сортировка по убыванию
        for (int i = 0; i < matrix[0].length; i++) {

            boolean sorting = true;

            while(sorting){

                sorting = false;

                for (int j = 0; j < matrix.length - 1; j++) {

                    if(matrix[j][i] < matrix[j + 1][i]){

                        int buf = matrix[j][i];
                        matrix[j][i] = matrix[j + 1][i];
                        matrix[j + 1][i] = buf;

                        sorting = true;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {   //вывод на экран
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf("% 4d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
