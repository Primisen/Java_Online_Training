package com.primisen.string.string_as_object;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {

    public static void main(String[] args) {

        String text = "Java Basic     Syntax";

        String [] word = text.split(" ");

        int counter = 1;

//        for (int i = 0; i < word.length; i++) {
//
//            System.out.println(i + " " + word[i]);
//        }

        for (int i = 0; i < word.length; i++) {

            if (word[i].equals("")){
                counter++;
            }
        }

        System.out.println("The largest number of consecutive spaces: " + counter);
    }
}
