package com.primisen.string.string_as_object;

/*
Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным или вопросительным
знаком. Определить количество предложений в строке X.
 */

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your text: ");

        String string = sc.nextLine();

        int counter = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '.' || string.charAt(i) == '!' || string.charAt(i) == '?'){

                counter++;
            }
        }

        System.out.println("Answer: " + counter);
    }
}
