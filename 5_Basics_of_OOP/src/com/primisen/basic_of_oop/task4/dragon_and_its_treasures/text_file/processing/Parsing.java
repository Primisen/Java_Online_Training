package com.primisen.basic_of_oop.task4.dragon_and_its_treasures.text_file.processing;

import java.io.BufferedReader;
import java.io.IOException;

/*Представленный клас не универсален.
Он создан для обработки текстового файла по структуре аналогичному файлу Treasure.txt
т. е. номер → точка → пробел → текст без использования цифр → запятая → целое положительное число → новая строка
 */
public class Parsing {

    private int maxValue = 100; //мы заранее знаем, что элементов у нас 100

    private String line;

    private int[] numbers = new int[maxValue];

    public void setNumbers(BufferedReader bufferedReader) throws IOException {

//        for (int i = 0; i < numbers.length; i++) { //каждая ячейка = каждая строка

            while ((line = bufferedReader.readLine()) != null) {

                String[] pieces = line.split(" ");

                int i = 0;

                for (int k = 0; k < pieces.length; k++) {
                    try {
                        int a = Integer.parseInt(pieces[k]);

                        numbers[i] = a;
                        System.out.println(numbers[i] + " ");

                        i++;
                    } catch (Exception e) {
                    }
//                }
            }
        }

        for (int j = 0; j < numbers.length; j++) {

            System.out.println("num: " + numbers[j]);
        }
    }

    public int [] getNumbers (){
        return numbers;
    }
}
