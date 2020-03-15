package com.primisen.programming_with_class.composition.Task5;

public class Cruise {

    private static int minimalNumberDaysInTraveling = 3;
    private static int maximumNumberDaysInTraveling = 21;

    enum Transport{

        PLANE,
        BUS,
        SHIP
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
