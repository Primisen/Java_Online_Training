package com.primisen.algorithmization.multidimensional_array;

import java.util.Random;

//работает неправильно
/*
    Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.
 */
public class Task14 {

    public static void main(String[] args) {

        Random rand = new Random();

        int [][] matrix = new int [5][4];

        for (int column = 0; column < matrix[0].length; column++) {
            for (int i = 0; i < column + 1; i++) {

                int pos;

                do {
                    pos = rand.nextInt(matrix.length);
                }
                while(matrix[pos][column] == 1);

                matrix[pos][column] = 1;
            }
        }

        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0 ;j < matrix[i].length; j++){

                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
