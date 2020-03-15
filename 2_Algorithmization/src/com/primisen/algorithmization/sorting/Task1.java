package com.primisen.algorithmization.sorting;

/*
    Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    дополнительный массив.
 */

public class Task1 {

    public static void main(String[] args) {

        int[] arrayFirst = {0, 1, 2, 3, 4, 5};
        int[] arraySecond = {0, 1, 2, 3};

        int k = 2;

        int[] commonArray = new int[arrayFirst.length + arraySecond.length];

        for (int i = 0; i <= k; i++) {  //запись первой части(до k) первого массива

            commonArray[i] = arrayFirst[i];
        }

        int j = 0;

        for (int i = k + 1; i < k + 1 + arraySecond.length; i++) {//запись второго массива

            commonArray[i] = arraySecond[j];
            j++;
        }

        for (int i = k + 1 + arraySecond.length; i < commonArray.length; i++) {//запись второй части(после k) второго массива

            commonArray[i] = arrayFirst[k + 1];
            k++;
        }

        for (int i = 0; i < commonArray.length; i++) {

            System.out.print(commonArray[i] + "  ");
        }
    }
}
