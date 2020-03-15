package com.primisen.string.string_as_object;

// Проверить, является ли заданное слово палиндромом.

public class Task3 {

    public static void main(String[] args) {

        String givenWord = "alula";

        boolean answer = givenWord.equals(new StringBuilder(givenWord).reverse().toString());

        System.out.println("Answer: " + answer);
    }
}
