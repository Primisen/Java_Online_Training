package com.primisen.algorithmization.sorting;

/*
    Сортировка выбором. Дана последовательность чисел
    a_1 < a_2 < ... < a_n. Требуется переставить элементы так,
    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    повторяется. Написать алгоритм сортировки выбором
 */
public class Task3 {

    public static void main(String[] args) {

        int[] array = {4, 9, 0, -3, 5};

        for (int i = 0; i < array.length; i++) {

            int currentIndex = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[currentIndex] > array[j]) {

                    currentIndex = j;
                }
            }
            if (currentIndex != i) {

                int buf = array[currentIndex];
                array[currentIndex] = array[i];
                array[i] = buf;
            }

        }

        for (int i = 0; i < array.length; i++) {


            System.out.print(array[i] + " ");
        }
    }
}
