package com.primisen.algorithmization.method;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
решения задачи использовать декомпозицию.
*/

public class Task13 {

    public static void main(String[] args) {

        int n = 18;

        formingArrayWithTwins(n);
    }

    private static void formingArrayWithTwins(int n){

        int twin = n;

        while (twin + 2 <= n*2){

            printTwins(twin, twin + 2);

            twin += 2;
        }
    }

    private static void printTwins(int firstTwin, int secondTwin){

        System.out.println(firstTwin + " and " + secondTwin);
    }
}
