package com.primisen.algorithmization.one_dimensional_array;

/*
    Дан массив действительных чисел, размерность котрого N.
    Подсчитать, сколько в нем отрицательных, положительных, и нулевых элементов.
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lengthOfArray = 0;

        do{
            System.out.print("Enter positive N: ");

            while (!sc.hasNextInt()){

                System.out.println("Value is incorrect. Try again.");
                sc.next();
            }

            lengthOfArray = sc.nextInt();
        }while (lengthOfArray <= 0);

        double[] array = new double[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {

            System.out.print("Enter " + (i + 1) + " element of array: " );

            while (!sc.hasNextDouble()){

                System.out.println("Value is incorrect. Try again.");
                sc.next();
            }

            array[i] = sc.nextDouble();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int negativeCount = 0;

        for(double elementOfArray : array){

            if (elementOfArray < 0){
                negativeCount++;
            }
        }

        int zeroCount = 0;

        for(double elementOfArray: array){

            if (elementOfArray == 0){
                zeroCount++;
            }
        }

        int positiveCount = 0;

        for(double elementOfArray : array){

            if(elementOfArray > 0){
                positiveCount++;
            }
        }

        System.out.println("Number of negative elements: " + negativeCount);
        System.out.println("Number of zero elements: " + zeroCount);
        System.out.println("Number of positive elements: " + positiveCount);
    }
}