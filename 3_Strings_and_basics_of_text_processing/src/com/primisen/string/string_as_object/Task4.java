package com.primisen.string.string_as_object;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4 {

    public static void main(String[] args) {

        String oldWord = "информатика";

        String newWord = ""; //торт

        newWord = String.valueOf(oldWord.charAt(7)) + String.valueOf(oldWord.charAt(3)) + String.valueOf(oldWord.charAt(4)) + String.valueOf(oldWord.charAt(7));

        System.out.println(newWord);
    }
}
