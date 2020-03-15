package com.primisen.algorithmization.one_dimensional_array;

/*
    Даны действительные числа а1, а2,..,аn.
    Поменять местами наибольший и наименьший элементы.
 */
public class Task4 {

    public static void main(String [] args){

        double [] array = {-6.32, -1.2, 7.43, 12.43, 9.54, 10.34};

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();

        int indexOfMinElement = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i] < array[indexOfMinElement]){

                indexOfMinElement = i;
            }
        }

        int indexOfMaxElement = 0;

        for (int i = 0; i < array.length; i++) {

            if(array[i] > array[indexOfMaxElement]){

                indexOfMaxElement = i;
            }
        }

        double buf = array[indexOfMaxElement];
        array[indexOfMaxElement] = array[indexOfMinElement];
        array[indexOfMinElement] = buf;

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}