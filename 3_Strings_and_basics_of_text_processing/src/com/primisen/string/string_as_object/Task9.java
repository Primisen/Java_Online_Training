package com.primisen.string.string_as_object;

/*
Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские
буквы.
*/

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int upperCounter = 0;
        int lowerCounter = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);
            if (((ch >= 'A' && ch <= 'Z')) || ((ch >= 'a' && ch <= 'z'))) {

                if (Character.isUpperCase(text.charAt(i))) {

                    upperCounter++;
                }
                if (Character.isLowerCase(text.charAt(i))) {

                    lowerCounter++;
                }
            }
        }

        System.out.println("Number of upper case elements: " + upperCounter);
        System.out.println("Number of lower case elements: " + lowerCounter);
    }
}
