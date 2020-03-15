package com.primisen.algorithmization.multidimensional_array;

import java.util.Scanner;

/*
    В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    пользователь с клавиатуры.
 */
public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][] matrix = {
                {0, 1, 2, 3, 4},
                {5, 6, 7, 8, 9},
                {0, 1, 4, 2, 7},
                {1, 6, 3, 0, 4}};

        System.out.println("Number of columns: " + matrix[0].length);

        System.out.println("Enter index of first column");
        int firstColumn = getIndexOfColumn(matrix);

        System.out.println("Enter index of second column");
        int secondColumn = getIndexOfColumn(matrix);

        swap(matrix, firstColumn, secondColumn);

        for (int i = 0; i < matrix.length; i++) {           //вывод в консоль

            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int getIndexOfColumn(int [][] matrix){

        int column = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter correct index of column: ");

            while (!sc.hasNextInt()){

                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            column = sc.nextInt();

        }while (column < 0 || column >= matrix[0].length);

        return column;
    }

    private static void swap(int [][] matrix, int firstColumn, int secondColumn){

        int [] swapArray = new int [matrix.length];

        for (int i = 0; i < matrix.length ; i++) {

            swapArray[i] = matrix[i][firstColumn];
        }

        for (int i = 0; i < matrix.length; i++) {

            matrix[i][firstColumn] = matrix[i][secondColumn];
        }

        for (int i = 0; i < matrix.length; i++) {

            matrix[i][secondColumn] = swapArray[i];
        }
    }
}
