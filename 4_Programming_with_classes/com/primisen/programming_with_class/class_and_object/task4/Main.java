package com.primisen.programming_with_class.class_and_object.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Train [] trains = new Train[2];

        createObjectsArray(trains);

        int [] trainsNumber = new int [trains.length];

        for (int i = 0; i < trainsNumber.length; i++) {

            trainsNumber[i] = trains[i].getTrainNumber();
        }
        Train.sortingTrains(trainsNumber, trains);

        System.out.println("--------------");
        Train.informationAboutTrain(trains);

        System.out.println("----------------");

        String[] finishStation = new String[trains.length];
        for (int i = 0; i < finishStation.length; i++) {

            finishStation[i] = trains[i].getFinishStation();
        }
        Train.sortingTrains(finishStation, trains);


    }

    private static void createObjectsArray(Train[] trains){

        for (int i = 0; i < trains.length; i++) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter finish station: ");
            String finishStation = scanner.nextLine();

            Scanner scanner2 = new Scanner(System.in);

            System.out.print("Enter train number: ");

            while (!scanner2.hasNextInt()) {
                scanner2.next();
            }
            int trainNumber = scanner2.nextInt();


            Scanner scanner1 = new Scanner(System.in);
            System.out.print("Enter time departure: ");
            float timeDeparture;
            do {
                while (!scanner1.hasNextFloat()) {
                    scanner1.next();
                }
                timeDeparture = scanner1.nextFloat();

            }while (timeDeparture < 00.00 || timeDeparture > 23.59);

            trains[i] = new Train(finishStation, trainNumber, timeDeparture);
        }
    }
}