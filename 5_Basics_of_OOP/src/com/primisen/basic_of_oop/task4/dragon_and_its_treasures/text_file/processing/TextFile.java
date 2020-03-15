package com.primisen.basic_of_oop.task4.dragon_and_its_treasures.text_file.processing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TextFile {

    // The name of the text_file to open.
    private String fileName;

    // This will reference one line at a time
    private String line;

    BufferedReader bufferedReader; //ключевая переменная

    public TextFile(String fileName) {
        line = null;
        this.fileName = fileName;
    }

    public BufferedReader open(){

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            bufferedReader = new BufferedReader(fileReader);

//            while((line = bufferedReader.readLine()) != null) {
//                System.out.println(line);
//            }
//
//            // Always close files.
//            bufferedReader.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open text_file '" + fileName + "'");
        }
        catch(IOException ex) {
            System.out.println("Error reading text_file '" + fileName + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }

        return bufferedReader;
    }

    public void close() {

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        try {

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int [] getDigitInformation() {//не совсем правильный метод. ведь в нашем тхт файле 2 числа, мы будем вытаскивать только одно

        int [] numbers = new int [100];

        Parsing parsing = new Parsing();
        try {
            parsing.setNumbers(bufferedReader);
            numbers = parsing.getNumbers();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("number [" + i + "] " + numbers[i]);
        }

        return numbers;
    }
}
