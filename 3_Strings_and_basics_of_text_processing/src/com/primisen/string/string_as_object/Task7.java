package com.primisen.string.string_as_object;

/*
Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено
"abc cde def", то должно быть выведено "abcdef".
 */

import java.util.Scanner;

public class Task7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String str = sc.nextLine();

        str = str.replaceAll("\\s+", "");

        str = removeDuplicate(str);

        System.out.println(str);
    }

    static String removeDuplicate(String str) {

        StringBuilder noDuplicate = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            String si = str.substring(i, i + 1);

            if (noDuplicate.indexOf(si) == -1) {

                noDuplicate.append(si);
            }
        }

        return noDuplicate.toString();
    }
}
