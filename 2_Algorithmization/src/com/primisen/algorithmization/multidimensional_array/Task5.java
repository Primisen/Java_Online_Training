package com.primisen.algorithmization.multidimensional_array;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task5 {

    public static void main(String[] args) {

        int n = 6;

        int[][] array = new int[n][n];

        for (int i = 0; i < array.length; i++) {    //заполнение без нулей
            for (int j = 0; j < array.length; j++) {

                array[i][j] = i + 1;
            }
        }

        for (int i = 1; i < array.length; i++) {        // обнуление нужных элементов
            for (int j = array.length - i; j < array.length; j++) {

                array[i][j] = 0;
            }
        }

        for (int i = 0; i < array.length; i++){     //вывод на экран
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
