package com.primisen.algorithmization.sorting;

/*
    Даны две последовательности
    a_1 <= a_2 <= ... <= a_n и b_1 <= b_2 <= ... <= b_m.
    Образовать из них новую последовательность
    чисел так, чтобы она тоже была неубывающей.
    Примечание. Дополнительный массив не использовать.
 */

public class Task2   {

    public static void main(String[] args) {

        int [] arrayFirst = {0, 1, 3, 5, 6};
        int [] arraySecond = {-1 ,5, 7};

        int [] arrayCommon = new int [arrayFirst.length + arraySecond.length];

        int j = 0;

        for (int i = 0; i < arrayFirst.length; i++) {

            arrayCommon[i] = arrayFirst[j];
            j++;
        }

        int k = 0;

        for (int i = j; i < arraySecond.length; i++) {

            arrayCommon[i] = arraySecond[k];
            k++;
        }

        boolean sorting = true;

        while (sorting){

            sorting = false;

            for (int i = 0; i < arrayCommon.length - 1; i++) {

                if (arrayCommon[i] > arrayCommon[i + 1]){

                    int buf = arrayCommon[i];
                    arrayCommon[i] = arrayCommon[i + 1];
                    arrayCommon[i + 1] = buf;

                    sorting = true;
                }
            }
        }

        for (int i = 0; i < arrayCommon.length; i++) {

            System.out.print(arrayCommon[i] + " ");
        }
    }
}
