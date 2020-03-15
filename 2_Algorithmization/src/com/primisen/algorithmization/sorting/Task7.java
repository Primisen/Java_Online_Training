package com.primisen.algorithmization.sorting;

//небольшие некорректности
/*
    Пусть даны две неубывающие последовательности действительных чисел
    a_1 <= a_2 <= ... <= a_n и b_1 <= b_2 <= ... <= b_m.
    Требуется указать те места, на которые нужно вставлять элементы последовательности
    b_1 <= b_2 <= ... <= b_m
    в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task7 {

    public static void main(String[] args) {

        int [] arrayFirst = {3, 5, 6, 9};
        int [] arraySecond = {-6, 7, -9, 0};

        int [] commonArray = new int [arrayFirst.length + arraySecond.length];

        for (int i = 0; i < arrayFirst.length; i++) {   //запись первого подмассива

            commonArray[i] = arrayFirst[i];
        }

        int k = 0;
        for (int i = arrayFirst.length; i < commonArray.length; i++) { //запись второго подмассива

            commonArray[i] = arraySecond[k];
            k++;
        }

        for (int i = arrayFirst.length; i < commonArray.length; i++) {  //сортировка вставками

            int currentElement = commonArray[i];

            int j = i - 1;

            while (j >= 0 && currentElement < commonArray[j]){

                commonArray[j + 1] = commonArray[j];
                j--;
            }

            commonArray[j + 1] = currentElement;

            if (i != j + 1) {

                System.out.println("Element: " + currentElement + " New position: " + (j + 1));
            }
        }

        for (int i = 0; i < commonArray.length; i++) {

            System.out.print(commonArray[i] + " ");
        }
    }
}
