package com.primisen.algorithmization.one_dimensional_array;

/*
    В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
    чисел несколько, то определить наименьшее из них.
 */

public class Task9 {

    public static void main(String[] args) {

        int [] array = {5, 4, 4, 2, 5, 5, 5, 4, 4};

        int countRepeatNow; //переменная для подсчета повторений числа в массиве
        int countRepeatBefore = 0; //хранение повторений предыдущего числа

        int currentElement;

        int [] arrayIndexOfCheckedElements = new int[array.length]; //массив будет хранить значения индексов чисел, которые мы уже считали

        int max = array[0];

        for (int i = 0; i < array.length; i++) {

            int j = 0;

            /*
            Блок ниже проверяет, сталквались ли мы с элементом при подсчете повторов числа(проверка происходит по индексу).
            Комментарий по if(i != 0) - пропуск проверки элемента с индексом ноль, так как первоначально
            массив, хранящий индексы проверенных чисел arrayIndexOfCheckedElements, заполнен нулями.
             */
            if (i != 0) {

                while (i != arrayIndexOfCheckedElements[j] && j < arrayIndexOfCheckedElements.length - 1) { //цикл прервется, если i == arrayIndexOfCheckedElements

                    j++;
                }
            }

            if (i == arrayIndexOfCheckedElements[j] && i != 0) {

                continue;
            }

            /*
            Дополнительный комментарий.
            i - это текущий индекс элемнта. этот индекс уже мог был занесен в массив arrayIndexOfCheckedElements,
            так как возможно что значение с этим индексом уже встречалось до этого в массиве, например:
            4, 7, 4 - при подсчете повторений числа 4 в массив arrayIndexOfCheckedElements будут занесены индексы 0 и 2.
             */

            currentElement = array[i];
            countRepeatNow = 0;

            int k = 0;
            while (k < array.length){//блок подсчета повторений числа в мссиве

                if(array[k] == currentElement){

                    countRepeatNow++;
                }

                k++;
            }

            int [] mostFrequentlyRepeatedItems = new int [array.length/2];  //наиболее часто повторяющиеся элементы
            int n = 0;

            if(countRepeatBefore < countRepeatNow){

                countRepeatBefore = countRepeatNow;

                max = array[i];

            } else if(countRepeatBefore == countRepeatNow){

                if(max < array[i]){
                    max = array[i];
                }
            }
        }

        System.out.println("Answer: " + countRepeatBefore);

        System.out.println("Max: " + max);
    }
}