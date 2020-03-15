package com.primisen.algorithmization.one_dimensional_array;

/*
    Задана последовательность N вещественных чисел. Вычислиь сумму
    чисел, порядковые номера которых являются простыми числами.
 */

public class Task6 {

    public static void main(String [] args){

        double [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 13, 12};

        int sum = 0;

        boolean simpleNumber; //простое число

        int firstSimpleNumber = 2;

        for (int i = firstSimpleNumber; i < array.length; i++) {

            simpleNumber = true;

            int j = i - 1;

            while (simpleNumber && j >= firstSimpleNumber){  //блок проверки на простое число

                if (i % j == 0) {

                    simpleNumber = false;
                }
                else {

                    j--;
                }
            }

            if (simpleNumber) {

                sum += array[i];
            }
        }

        System.out.println("Sum: " + sum);
    }
}