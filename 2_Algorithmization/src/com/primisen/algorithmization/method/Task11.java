package com.primisen.algorithmization.method;

import java.util.Scanner;

//    Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр

public class Task11 {

    public static void main(String[] args) {

        System.out.print("Enter first number: ");
        int firstNumber = getInt();

        System.out.print("Enter second number: ");
        int secondNumber = getInt();

        int lengthOfFirstNumber = countingTheNumberOfDigits(firstNumber);
        int lengthOfSecondNumber = countingTheNumberOfDigits(secondNumber);

        int biggerNumber = searchToBigger(lengthOfFirstNumber, lengthOfSecondNumber);

        if(biggerNumber == lengthOfFirstNumber){
            System.out.println("Bigger number is " + firstNumber);

        }else if(biggerNumber == lengthOfSecondNumber){
            System.out.println("Bigger number is " + secondNumber);
        }
    }

    public static int countingTheNumberOfDigits(int number){
        
        int count = 0;

        while(number > 0) {

            number /= 10;
            count++;
        }

        return count;
    }

    public static int searchToBigger(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;

        } else if (secondNumber < firstNumber) {
            return secondNumber;

        } else {
            return -1;
        }
    }

    private static int getInt(){

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()){

            System.out.println("The value is incorrect. Try again.");
            sc.next();
        }

        return sc.nextInt();
    }
}