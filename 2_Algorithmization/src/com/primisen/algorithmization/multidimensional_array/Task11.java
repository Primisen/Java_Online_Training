package com.primisen.algorithmization.multidimensional_array;

import java.util.Random;

/*
    Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз
 */
public class Task11 {

    public static void main(String[] args) {

        Random rand = new Random();

        int [][] matrix = new int[10][20];

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {           //блок заполение рандомными числами
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = rand.nextInt(16);
            }
        }

        for (int i = 0; i < matrix.length; i++) {           //вывод заполненной матрицы на экран

            System.out.print(i + ": ");

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf("% 6d", matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.print("Number of row: ");

        for (int i = 0; i < matrix.length; i++) {           //поиск нужной строки
            for (int j = 0; j < matrix[i].length; j++) {

                if(matrix[i][j] == 5){
                    count++;
                }

                if (count == 3 ){

                    System.out.print( i + " ");

                    count = 0;

                    j = matrix[i].length - 1; //так мы выходим из цикла j
                }
            }
        }
    }
}
