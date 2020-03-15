package com.primisen.algorithmization.one_dimensional_array;

/*
    Дана последовательность действительных чисел а1, а2,..,аn.
    Заменить все ее члены, больше данного Z, этим числом.
    Подсчитать количество замен.
 */

import java.util.Scanner;

public class Task2 {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Z: ");

        while (!sc.hasNextDouble()){
            
            System.out.println("The value is incorrect. Try again.");
            sc.next();
        }
        double enterNumber = sc.nextDouble();

        double [] array = {2.4, 0.5, 3.1, 4.8};

        int counter = 0;
        
        for(double elementOfArray : array){
        
            if (elementOfArray > enterNumber){
                
                elementOfArray = enterNumber;
                counter++;
            }
        }

        System.out.println("Number of replacements: " + counter);
    }
}