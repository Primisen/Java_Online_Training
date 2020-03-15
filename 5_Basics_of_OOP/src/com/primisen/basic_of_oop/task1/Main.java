package com.primisen.basic_of_oop.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TextFile textFile = new TextFile("SomeText");

        System.out.println("Enter you text: ");
        textFile.create();

        System.out.println("Enter added text: ");
        String addedText = scanner.nextLine();

        textFile.supplement(addedText);

        System.out.println("New text: ");
        textFile.printText();

        System.out.println("Enter new name text: ");
        String newNameText = scanner.nextLine();
        textFile.rename(newNameText);

        System.out.println("Are wont delete text? Enter y(if  yes) or n (if no).");

        String answer = scanner.nextLine();
        if (answer.equals("y")) {

            textFile.remove();
            System.out.println("Text deleted.");
        }
    }
}
