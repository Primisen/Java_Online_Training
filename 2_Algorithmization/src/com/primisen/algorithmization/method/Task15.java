package com.primisen.algorithmization.method;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию
 */
public class Task15 {

    public static void main(String[] args) {

        int n = 5;

        getArray(n);
    }

    private static int setSizeOfNumber(int n){ //установить n-значность, то есть найти первое(самое маленькое) n-значное число

        return (int) Math.pow(10, n - 1);
    }

    private static void getArray(int n){

        for (int i = setSizeOfNumber(n); i < setSizeOfNumber(n) * 10; i++) {

            if(checkDigitsOnNumber(i)){

                printNumber(i);
            }
        }
    }

    private static void printNumber(int number){

        System.out.print(number + " ");
    }

    public static boolean checkDigitsOnNumber(int number){  //проверка числа на данное условие

        boolean increasingSequence = true; //возрастающая последовательность

        int before = number % 10;
        number /= 10;

        while (number != 0 && increasingSequence){

            int now = number % 10;

            if(now >= before){   //потому что мы идем с конца числа, с наименьшего разряда

                increasingSequence = false;
            }
            before = now;

            number /= 10;
        }

        return increasingSequence;
    }
}
