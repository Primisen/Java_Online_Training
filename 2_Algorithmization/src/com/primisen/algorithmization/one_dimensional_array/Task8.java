package com.primisen.algorithmization.one_dimensional_array;

/*
    Дана последовательность целых чисел (a_1, a_2, ... , a_n).
    Образовать новую последовательность, выбросив из
    исходной те члены, которые равны
    min(a_1, a_2,..., a_n)
 */
public class Task8 {

    public static void main(String[] args) {

        int [] array = {-12, 3, 7, -12, 76, -12, 1, 4, -12, 5, -12};

        int minElementOfArray = array[0];

        for (int i = 0; i < array.length; i++) {  //поиск минимального значения массива

            if (minElementOfArray > array[i]){

                minElementOfArray = array[i];
            }
        }

        int count = 0; //переменная для подсчета: сколько раз минимальное число встречается в массиве

        for (int i = 0; i < array.length; i++) {

            if (array[i] == minElementOfArray){

                count++;
            }
        }

        int [] arrayWithoutMinElement = new int [array.length - count];

        int j = 0;

        for (int i = 0; i < arrayWithoutMinElement.length; i++) {

            while (array [j] == minElementOfArray){

                j++;
            }

            arrayWithoutMinElement[i] = array[j];

            j++;
        }

        for (int elementOfArray: arrayWithoutMinElement) {

            System.out.print(elementOfArray + " ");
        }

    }
}