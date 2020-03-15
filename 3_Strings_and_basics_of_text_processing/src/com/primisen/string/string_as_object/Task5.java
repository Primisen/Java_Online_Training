package com.primisen.string.string_as_object;

// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {

    public static void main(String[] args) {

        String string = "The java source code can run on all operating systems.";
        String searchSymbol = "a";

        int count = string.length() - string.replace(searchSymbol, "").length();
        
        System.out.println("Answer: " + count);
    }
}
