package com.primisen.algorithmization.method;

/*
    Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
    натуральных чисел:
 */
public class Task1 {

    public static void main(String[] args) {

        int a = 7;
        int b = 12;

        System.out.println("NOD = " + nod(a, b));
        System.out.println("NOK = " + nok(a, b));
    }

    public static int nod(int a, int b){

        int buf;

        while (a % b != 0) {
            buf = b;
            b = a % b;
            a = buf;
        }
        return b;
    }

    public static int nok(int a, int b){
        return a*b/nod(a, b);
    }
}