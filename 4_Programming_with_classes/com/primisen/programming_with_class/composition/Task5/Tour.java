package com.primisen.programming_with_class.composition.Task5;

public class Tour {

    private static int minimalNumberDaysInTraveling = 14;
    private static int maximumNumberDaysInTraveling = 21;

    enum Transport{

        PLANE,
        CAR,
        BUS,
        TRAIN
    }

    enum Nutrition{ //питание

        RESTAURANT,
        CAFE,
        BAR
    }

    public int getMinimalNumberDaysInTraveling() {
        return minimalNumberDaysInTraveling;
    }

    public int getMaximumNumberDaysInTraveling() {
        return maximumNumberDaysInTraveling;
    }
}
