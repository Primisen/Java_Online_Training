package com.primisen.basic_of_oop.task4.dragon_and_its_treasures.main;

import java.util.Scanner;

public class ReadWithConsole {

    private Scanner sc = new Scanner(System.in);

    private int indexOfChoose;

    private int minIndexOfChoose;
    private int maxIndexOfChoose;

    public ReadWithConsole(){

        minIndexOfChoose = 1;
        maxIndexOfChoose = 5;
    }

    public int getIndexOfChoose() {
        return indexOfChoose;
    }

    public void read() {
        do {

            while (!sc.hasNextInt()) {

                System.out.println("This button does not exist. Try again.");
                sc.next();
            }

            indexOfChoose = sc.nextInt();

            if (indexOfChoose < minIndexOfChoose || indexOfChoose > maxIndexOfChoose) {

                System.out.println("This button does not exist. Try again.");
            }
        } while (indexOfChoose < minIndexOfChoose || indexOfChoose > maxIndexOfChoose);
    }
}
