package com.primisen.algorithmization.method;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми (т. е. если нод = 1)
 
public class Task6 {

    public static void main(String[] args) {

        int a = 3;
        int b = 8;
        int c = 1;

        System.out.println("Answer: " + check(a, b, c));
    }

    private static int nod (int a, int b){

        while (a % b != 0){

            int buf = b;
            b = a % b;
            a = buf;
        }

        return b;
    }

    private static boolean check(int a, int b, int c){

        boolean check = true;

        if (nod(a,b) != 1 || nod(a,c) != 1 || nod(b, c) != 1){

            check = false;
        }

        return check;
    }
}
