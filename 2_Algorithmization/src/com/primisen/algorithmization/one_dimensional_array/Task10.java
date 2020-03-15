package com.primisen.algorithmization.one_dimensional_array;

/*
    Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
    элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать
 */

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 0;

        do{
            System.out.print("Enter positive value: ");

            while (!sc.hasNextInt()){

                System.out.println("The value is incorrect. Try again.");
                sc.next();
            }

            n = sc.nextInt();

        }while (n <= 0);

        int [] array = new int [n];

        for (int i = 0; i < array.length; i++) {

            array [i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) { //присваивание каждому второму элементу значение ноль

            if (i % 2 != 0){

                array[i] = 0;
            }
        }

        int j = 0;

        int length = array.length - array.length/2; //при нечетной длине массива array.length/2 округлится в меньшую сторону и последний элемент не сдвинется на свою позицию

        for (int i = 0; i < length; i++){

            while (array[j] == 0) {

                j++;
            }

            array[i] = array[j];

            if (i != j){ //если i=j, то при array[j] = 0, array[i] так же обнулится
                array[j] = 0;
            }

            j++;
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }
}