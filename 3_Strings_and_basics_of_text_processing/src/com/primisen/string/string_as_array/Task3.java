package com.primisen.string.string_as_array;

//В строке найти количество цифр

public class Task3 {

    public static void main(String[] args) {

        String string = "11gy4htg";

        char [] digits = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

        int counter = 0;

        for (int i = 0; i < string.length(); i++) {

            for (int j = 0; j < digits.length; j++) {

                if(string.charAt(i) == digits[j]){

                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
