package com.primisen.basics.loop;

//программа не может определять наличие 0 в цифрах
//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа

public class Task8 {

    public static void main(String[] args) {

        int firstNumber = 36941;

        int secondNumber = 331767769;

        int copyOfSecondNumber = secondNumber;
        /*
            Переменная copyOfSecondNumber хранит то же значение, что и secondNumber,
            но в одном из циклов нам нужно использовать измененное значени secondNumber
            и после прохождения цикла мы должни использовать исходное значение переменной secondNumber.
         */

        while (firstNumber % 10 > 0) {

            int remainderOfDivisionOfFirstNumber = firstNumber % 10;

            firstNumber = firstNumber / 10;

            while (copyOfSecondNumber % 10 > 0){

                int remainderOfDivisionOfSecondNumber = copyOfSecondNumber % 10;

                copyOfSecondNumber = copyOfSecondNumber / 10;


                if(remainderOfDivisionOfSecondNumber == remainderOfDivisionOfFirstNumber){

                    System.out.println(remainderOfDivisionOfFirstNumber);
                }
            }

            copyOfSecondNumber = secondNumber;
        }
    }
}