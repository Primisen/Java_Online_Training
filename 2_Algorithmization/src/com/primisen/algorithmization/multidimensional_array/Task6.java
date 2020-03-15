package com.primisen.algorithmization.multidimensional_array;

// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное)

public class Task6 {

    public static void main(String[] args) {

        int n = 10;

        int [][] array = new int [n][n];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){

                array[i][j] = 1;
            }
        }

        /*Далее мы разделяем (условно) матрицу на 4 равных части:
          левая верхняя, левая няжняя, правая верхняя, правая нижняя.
          Работа с определенной частью заключается в обнулении нужных элементов.
        */

        //left up
        for (int i = 0; i < array.length/2; i++){
            for (int j = 0; j < i; j++){
                array[i][j] = 0;
            }
        }
        //right up
        for (int i = 0; i < array.length/2; i++){
            for (int j = array.length - 1 ; j > array.length - 1 - i; j--){
                array[i][j] = 0;
            }
        }
        //left down
        for (int i = array.length/2; i < array.length; i++){
            for (int j = 0; j < array.length - 1 - i; j++){
                array[i][j] = 0;
            }
        }
        //right down
        for (int i = array.length/2; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                array[i][j] = 0;
            }
        }

        for (int i = 0; i < array.length; i++){     //вывод на экран    
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
