package com.primisen.string.string_as_array;

// Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class Task1 {

    public static void main(String[] args) {

        String[] camelCase = {"firstElement", "secondElement", "thirdElement", "fourthElement"};
        String [] snakeCase = new String[camelCase.length];

        System.out.print("Elements in camelCase: ");
        printArray(camelCase);

        for (int i = 0; i < camelCase.length; i++) {

            char [] camelCaseElement = camelCase[i].toCharArray();
            char[] snakeCaseElement = new char [camelCase[i].length() + 1];

            int k = 0;

            for (int j = 0; j < camelCase[i].length() + 1; j++) {

                if (!Character.isUpperCase(camelCaseElement[k])){

                    snakeCaseElement[j] = camelCaseElement[k];
                    k++;

                } else {

                    snakeCaseElement[j] = '_';
                    snakeCaseElement[++j] = Character.toLowerCase(camelCaseElement[k]);

                    k++;
                }
            }

            snakeCase[i] = new String(snakeCaseElement);
        }

        System.out.print("Elements in snake_case: ");
        printArray(snakeCase);
    }

    private static void printArray(String [] array){

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}