package com.primisen.string.string_as_object;

import java.util.Scanner;

/*
Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых
длинных слов может быть несколько, не обрабатывать.
 */
public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");

        String string = sc.nextLine();

        String [] word = string.split("\\s");

        String maxWord = new String();

        for (int i = 0; i < word.length; i++) {

            if(word[i].length() >= maxWord.length()){

                maxWord = word[i];
            }
        }

        System.out.println(maxWord);
    }
}
