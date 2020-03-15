package com.primisen.algorithmization.method;

/*
Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task5 {

    public static void main(String[] args) {

        int [] array = {3, 7, 9, 2, 6};

        int searchElement = array[0]; //искомый элемент
        int maxElement = max(array);

        for (int i = 0; i < array.length; i++) {

            if(array[i] > searchElement && array[i] < maxElement){

                searchElement = array[i];
            }
        }

        System.out.println(searchElement);

    }

    private static int max( int [] array){

        int max = 0;

        for (int i = 0; i < array.length; i++) {

            if (max < array[i]){

                max = array[i];
            }
        }
        return max;
    }
}
