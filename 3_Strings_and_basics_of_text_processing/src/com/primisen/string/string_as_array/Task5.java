package com.primisen.string.string_as_array;

/*
Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
Крайние пробелы в строке удалить.
 */
public class Task5 {

    public static void main(String[] args) {

        String string = "           I          live  in Minsk       ";

        char [] newS = new char[string.length()];

        char space = ' ';

        int j = 0;
        for (int i = 0; i < string.length() - 1; i++) {

            if (string.charAt(i) != space || string.charAt(i + 1) != space) {

                newS[j] = string.charAt(i);

                if(j != 0 || newS[j] != space) { //для устранения пробела в начале строки

                    j++;
                }
            }
        }

        System.out.println(new String(newS));
    }
}
