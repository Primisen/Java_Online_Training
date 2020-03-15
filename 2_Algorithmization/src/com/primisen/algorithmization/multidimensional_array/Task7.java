package com.primisen.algorithmization.multidimensional_array;

//Сформировать квадратную матрицу порядка N по правилу:
//и подсчитать количество положительных элементов в ней.

public class Task7 {

    public static void main(String[] args) {

        int n = 4;

        double [][]array = new double[n][n];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2))/n);
            }
        }

        int counter = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                if (array[i][j] > 0){
                    counter++;
                }
            }
        }
        System.out.println("Counter: " + counter);

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                System.out.printf("% 12f", array[i][j]);
            }
            System.out.println();
        }
    }
}
    