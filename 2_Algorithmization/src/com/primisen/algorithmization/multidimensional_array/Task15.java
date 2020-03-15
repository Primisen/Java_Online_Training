package com.primisen.algorithmization.multidimensional_array;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {

    public static void main(String[] args) {

        int [][]matrix = {
                {1, 2, 3},
                {4, 9, 3},
                {7, 8, 5}};

        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {   //поиск наибольшего элемента
            for (int j = 0; j < matrix[i].length; j++) {

                if (max < matrix[i][j]){

                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Max element = " + max);

        for (int i = 0; i < matrix.length; i++) {       //замена нечетных элементов на масимальный
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 != 0){
                    matrix[i][j] = max;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {       //вывод матрицы на консоль
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
