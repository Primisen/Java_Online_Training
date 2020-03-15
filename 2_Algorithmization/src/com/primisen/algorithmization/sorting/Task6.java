package com.primisen.algorithmization.sorting;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента a_i и a_i+1. Если
a_i <= a_i+1, то продвигаются на один элемент вперед. Если
a_i > a_i+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */

public class Task6 {

    public static void main(String[] args) {

        int[] array = {7, 4, -3, 1, 0};

        int i = 1;

        while (i < array.length - 1) {

            if (array[i] <= array[i + 1]) {
                i++;
                
            } else if (array[i] > array[i + 1]) {

                int buf = array[i];
                array[i] = array[i + 1];
                array[i + 1] = buf;

                if (i > 0) {
                    i--;
                }
            }
        }

        for (int j = 0; j < array.length; j++) {

            System.out.print(array[j] + " ");
        }
    }
}


