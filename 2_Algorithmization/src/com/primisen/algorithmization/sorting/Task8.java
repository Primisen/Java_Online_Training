package com.primisen.algorithmization.sorting;

/*
Даны дроби p_1/q_1, p_2/q_2, ..., p_n/q_n (p_i, q_i -- натуральные).
Составить программу, которая приводит эти дроби к общему
знаменателю и упорядочивает их в порядке возрастания
 */

public class Task8 {

    public static void main(String[] args) {

        int [] p = {4, 5, 7};
        int [] q = {2, 4, 12};

        float [] decimals = new float[p.length];    //десятичные дроби

        int nokCommon = nok (q[0], q[1]); //находим нок для первых двух чисел

        for (int i = 2; i < q.length; i++) {    //находим общий делитель

            nokCommon = nok(nokCommon, q[i]);
        }

        for (int i = 0; i < p.length; i++) {    //приводим к общему знаменателю

            p[i] = nokCommon / q[i] * p[i];
        }


        for (int i = 0; i < p.length; i++) {    //сортировка

            int indexOfMinElement = i;

            for (int j = i; j < p.length; j++) {

                if(p[indexOfMinElement] > p[j]){

                    indexOfMinElement = j;
                }

                if(indexOfMinElement != i){

                    int buf = p[i];
                    p[i] = p[indexOfMinElement];
                    p[indexOfMinElement] = buf;
                }
            }
        }

        for (int i = 0; i < p.length; i++) {

            System.out.println(p[i] + "/" + nokCommon);
        }
    }

    private static int nod (int a, int b){

        while (a % b != 0){

            int buf = b;
            b = a % b;
            a = buf;
        }

        return b;
    }

    private static int nok (int a, int b){

        return (a*b/nod(a,b));
    }
}
