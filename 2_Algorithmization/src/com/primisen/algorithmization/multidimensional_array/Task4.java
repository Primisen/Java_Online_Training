package com.primisen.algorithmization.multidimensional_array;

/*
    Сформировать квадратную матрицу порядка n
    по хаданному образцу (n - четное)
 */

public class Task4 {

    public static void main(String[] args) {

        int n = 10;

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i += 2) { //проходим по четным строкам
            for (int j = 0; j < array.length; j++) {

                array[i][j] = j + 1;
            }
        }

        for (int i = 1; i < array.length; i += 2) { //проходим по нечетным строкам
            for (int j = 0; j < array.length; j++) {

                array[i][j] = array.length - j;
            }
        }

        for (int i = 0; i < array.length; i++) {        //вывод на экран
            for (int j = 0; j < array[0].length; j++) {

                System.out.printf("% 3d", array[i][j]);
            }
            System.out.println();
        }
    }
}