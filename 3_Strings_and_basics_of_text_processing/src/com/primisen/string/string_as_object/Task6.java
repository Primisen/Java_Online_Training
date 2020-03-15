package com.primisen.string.string_as_object;

//Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {

    public static void main(String[] args) {

        String givenString = "String in Java is immutable";

        StringBuilder answerString = new StringBuilder();

        for (int i = 0; i < givenString.length(); i++) {

            for (int j = 0; j < 2; j++) {
                answerString.append(givenString.charAt(i));
            }
        }

        System.out.println(new String(answerString));
    }
}
