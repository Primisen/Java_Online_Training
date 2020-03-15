package com.primisen.algorithmization.multidimensional_array;

import java.util.Scanner;

/*
    Магическим квадратом порядка n называется квадратная матрица размера nxn,
    составленная из чисел 1, 2, 3,...n^2
    так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
    собой. Построить такой квадрат.
 */
public class Task16 {

    public static void main(String[] args) {

        //Данная программа строит магический квадрат только нечетного порядка.

        int n = enterLength();

        int[][] matrix = magicSquare(n);

        printMagicSquare(matrix);
}

    public static int [][] magicSquare(int n){

        int[][] matrix  = new int [n][n];

        int k = 1;

        int maxElement = n * n;

        int i = 0;
        int j = n/2;

        matrix[i][j] = k;

        int bufI = 0;
        int bufJ = 0;

        while (k < maxElement) {
            i--;
            j++;

            if (i < 0) {

                i = n - 1;
            }

            if (j >= n) {

                j = 0;
            }
            if (matrix[i][j] != 0) {

                i = bufI + 1;
                j = bufJ;
            }
            if (i < 0) {

                i = n - 1;
            }

            matrix[i][j] = ++k;

            bufI = i;
            bufJ = j;
        }

        return matrix;
    }

    public static void printMagicSquare(int [][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.printf("% 4d",matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int enterLength() {

        Scanner sc = new Scanner(System.in);

        int n = 0;

        do {
            System.out.print("Enter n: ");

            while (!sc.hasNextInt()) {

                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            n = sc.nextInt();

        } while (n <= 2 || n % 2 == 0);

        return n;
    }
}
