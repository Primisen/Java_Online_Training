package com.primisen.basic_of_oop.task4.dragon_and_its_treasures.main;

import com.primisen.basic_of_oop.task4.dragon_and_its_treasures.treasure.Treasure;

public class Main {

    public static void main(String[] args){

        ReadWithConsole readWithConsole = new ReadWithConsole();

        System.out.println("You are in the dragon cave. Press the button for further action.");

        System.out.println("1. Enter 1 ");

        int menu = 1;
        while (menu ==1) {

            System.out.print("Your input: ");

            readWithConsole.read();

            Treasure treasure = new Treasure();

            switch (readWithConsole.getIndexOfChoose()) {

                case 1:
                    treasure.printTreasure();
                    break;
                case 2:
                    treasure.printElementWithMaxPrise();
                    break;
                case 3:
                    treasure.searchTreasureSetPrise(500);
                    break;
                case 4:
                    menu = 0;
                    System.out.println("Exit.");
            }
        }
    }
}