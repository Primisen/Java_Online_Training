package com.primisen.algorithmization.multidimensional_array;

/*
    Дана матрица. Вывести на экран все нечетные столбцы,
    у которых первый элемент больше последнего.
 */
public class Task1 {

    public static void main(String [] args){

        int [][] matrix = {
                {1, 2, 3, 6, 7, 9},
                {4, 5, 6, 1, 3, 4},
                {7, 6, 1, 3, 0, 2}};

        int row = 0;

        int firstElementOfColumn = 0;
        int lastElementOfColumn = matrix.length - 1;

        for (int j = 0; j < matrix[row].length; j++){

            if(j % 2 != 0 && matrix[firstElementOfColumn][j] > matrix[lastElementOfColumn][j]){

                for (int i = 0; i < matrix.length; i++){

                    System.out.println(matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}
