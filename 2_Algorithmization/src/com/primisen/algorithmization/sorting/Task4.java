package com.primisen.algorithmization.sorting;

/*
    Сортировка обменами. Дана последовательность чисел a_1 < a_2 < ... < a_n.
    Требуется переставить числа в порядке возрастания.
    Для этого сравниваются два соседних числа a_i и a_i+1.
    Если a_i < a_i+1. 1, то делается перестановка.
    Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {

    public static void main(String[] args) {

        int[] array = {6, 4, 76, 13, -12, 17, 16, 99, 0};

        int counter = 0;

        boolean sorting = true;

        while (sorting) {

            sorting = false;

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {

                    int buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;

                    counter++;

                    sorting = true;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Number of transposition: " + counter);
    }
}
