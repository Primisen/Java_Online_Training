package com.primisen.algorithmization.sorting;

/*
    Сортировка вставками. Дана последовательность чисел a_1, a_2, ..., a_n.
    Требуется переставить числа в порядке возрастания. Делается это следующим образом.
    Пусть a_1, a_2,.., a_i - упорядоченная последовательность, т. е. a_1 <= a_2 <= ... <= a_n.
    Берется следующее число a_i+1 и вставляется в последовательность так, чтобы новая
    последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n
    не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
    с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task5 {

    public static void main(String[] args) {

        int [] array = {18, 4, -5, 9, 6, -7, 0};

        for (int i = 1; i < array.length; i++) {

            int currentElement = array[i];

            int[] sortedArray = new int[i + 1];

            for (int j = 0; j < sortedArray.length; j++) {

                sortedArray[j] = array[j];
            }

            int index = binarySearch(sortedArray, currentElement);

            if(index != i && index < i) {
                for (int j = i; j > index; j--) {

                    array[j] = array[j - 1];
                }
            }

            array[index] = currentElement;
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    public static int binarySearch(int arr[], int elementToSearch) {

        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        int middleIndex = 0;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                break;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;

                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;

        }
        return middleIndex;
    }
}
