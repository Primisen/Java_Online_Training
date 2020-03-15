package com.primisen.string.string_as_array;

// Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {

    public static void main(String[] args) {

        String string = "Write a word. Write a word again.";

        String oldSubString = "word";
        String newSubString = "letter";

        int firstIndex = 0;

        for (int i = 0; i < string.length(); i++) {

            int index = searchIndexOfSymbolInString(oldSubString.charAt(firstIndex), string);

            if(checkSearchWorld(index, oldSubString, string)){

                string = changeOldSubStringOnNewSubString(index, oldSubString, newSubString, string);
            }
        }

        System.out.println(string);
    }

    private static int searchIndexOfSymbolInString(char searchSymbol, String string){

        int i = 0;

        while (string.charAt(i) != searchSymbol && i < string.length() - 1){
            i++;
        }
        return i;
    }

    private static boolean checkSearchWorld(int index, String searchSubString, String string){ //проверка, действительно ли мы "наткнулись" на нужную подстроку

        boolean stringHaveSubString = true;

        int i = 0;

        while (stringHaveSubString && index < string.length() && i < searchSubString.length()){

            if(string.charAt(index) != searchSubString.charAt(i)){
                stringHaveSubString = false;
            }

            i++;
            index++;
        }

        return stringHaveSubString;
    }

    private static String changeOldSubStringOnNewSubString(int index,String oldSubString, String newSubString, String string){

        char [] replacedSymbols = new char [string.length() + newSubString.length()];

        int i = 0;
        while (i < index){

            replacedSymbols[i] = string.charAt(i);
            i++;
        }

        //i == index

        int j = 0;
        while (j < newSubString.length()){

            replacedSymbols[i] = newSubString.charAt(j);
            i++;
            j++;
        }

        j = index + oldSubString.length();
        while (i < replacedSymbols.length && j < string.length()){

            replacedSymbols[i] = string.charAt(j);
            i++;
            j++;
        }

        return new String(replacedSymbols);
    }
}
