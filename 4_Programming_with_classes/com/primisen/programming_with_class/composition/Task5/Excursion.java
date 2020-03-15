package com.primisen.programming_with_class.composition.Task5;

public class Excursion {

    private static int minimalNumberDaysInTraveling = 1;
    private static int maximumNumberDaysInTraveling = 3;

    enum Transport{

        CAR,
        BUS,
        BICYCLE
    }

    enum Nutrition{ //питание

        CAFE,
        CANTEEN, //столовая
    }

    public int getMinimalNumberDaysInTraveling() {
        return minimalNumberDaysInTraveling;
    }

    public int getMaximumNumberDaysInTraveling() {
        return maximumNumberDaysInTraveling;
    }
}
