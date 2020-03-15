package com.primisen.programming_with_class.class_and_object.task4;

import java.util.Scanner;

public class Train {

    private String finishStation;
    private int trainNumber;
    private float timeDeparture;

    public Train(String finishStation, int trainNumber, float timeDeparture){

        this.finishStation = finishStation;
        this.trainNumber = trainNumber;
        this.timeDeparture = timeDeparture;
    }

    public String getFinishStation() {
        return finishStation;
    }
    public int getTrainNumber() {
        return trainNumber;
    }
    public float getTimeDeparture() {
        return timeDeparture;
    }

    public static void sortingTrains(String[] finishStation, Train[] trains){

        for (int i = 0; i < finishStation.length; i++) {

            int index = i;

            for (int j = i; j < finishStation.length; j++) {

                int k = 0;
                while (k < finishStation[index].length() - 1 && k < finishStation[j].length() - 1) {

                    if (finishStation[index].charAt(k) < finishStation[j].charAt(k)) {

                        index = j;
                        break;
                    }
                    k++;
                }
            }

            if (index != i){

                String bufString = finishStation[i];
                finishStation[i] = finishStation[index];
                finishStation[index] = bufString;

                Train bufTrain = trains[i];
                trains[i] = trains[index];
                trains[index] = bufTrain;
            }
        }
    }

        public static void sortingTrains(int [] trainsNumber, Train [] trains){

        for (int i = 0; i < trainsNumber.length; i++) {

            int indexOfMaxElement = i;

            for (int j = i; j < trainsNumber.length; j++) {

                if (trainsNumber[indexOfMaxElement] < trainsNumber[j]) {

                    indexOfMaxElement = j;
                }
            }

            if (indexOfMaxElement != i){

                int bufInt = trainsNumber[i];
                trainsNumber[i] = trainsNumber[indexOfMaxElement];
                trainsNumber[indexOfMaxElement] = bufInt;

                Train bufString = trains[i];
                trains[i] = trains[indexOfMaxElement];
                trains[indexOfMaxElement] = bufString;
            }
        }
    }

    public static void informationAboutTrain(Train [] trains){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter train number: ");
        while (!scanner.hasNextInt()){
            scanner.next();
        }

        int trainNumber = scanner.nextInt();

        int index = 0;
        for (int i = 0; i < trains.length; i++) {

            if(trains[i].getTrainNumber() == trainNumber){
                index = i;
                break;
            } else{
                index = trains.length;
            }
        }

        if (index == trains.length) {

            System.out.println("Train not found.");
        } else {
            System.out.println("Information about train number " + trainNumber);
            System.out.println("Finish station: " + trains[index].getFinishStation());
            System.out.println("Time departure: " + trains[index].getTimeDeparture());
        }
    }
}