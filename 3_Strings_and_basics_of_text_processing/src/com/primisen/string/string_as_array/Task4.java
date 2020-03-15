package com.primisen.string.string_as_array;

//В строке найти количество чисел.

public class Task4 {

    public static void main(String[] args) {

        String string = "3h33ttg123yyy6440035gjh675 t88";

        int counter = 0;

        int counterOfNumbers = 0;

        char [] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        for (int i = 0; i < string.length(); i++) {

            for (int j = 0; j < digits.length; j++) {

                while (string.charAt(i) == digits[j] && i < string.length() - 1) {

                    i++;
                    j = 0;

                    counter++;
                }
            }

            if (counter > 0) {

                counterOfNumbers++;
            }

            counter = 0;
        }

        System.out.println("Answer: " + counterOfNumbers);
    }
}
