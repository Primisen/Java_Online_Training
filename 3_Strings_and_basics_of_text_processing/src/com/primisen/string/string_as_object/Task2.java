package com.primisen.string.string_as_object;

// В строке вставить после каждого символа 'a' символ 'b'

public class Task2 {

    public static void main(String[] args) {

        String text = "Java String literal";

        char  givenCharacter = 'a';
        char addCharacter = 'b';

        StringBuilder answerString = new StringBuilder(text);

        int j = 0;

        for (int i = 0; i < text.length(); i++) {

            j++;

            if (text.charAt(i) == givenCharacter){

                answerString.insert(j, addCharacter);
                j++;
            }
        }

        System.out.println(new String(answerString));
    }
}
