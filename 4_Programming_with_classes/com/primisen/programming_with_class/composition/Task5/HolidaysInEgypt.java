package com.primisen.programming_with_class.composition.Task5;

public class HolidaysInEgypt{

    private static int minimalNumberDaysInTraveling = 3;
    private static int maximumNumberDaysInTraveling = 21;

    enum Transport{

        PLANE,
        CAR,
        BUS
    }

    enum Nutrition{ //питание

        RESTAURANT,
        CAFE,
        BAR,
        SCORE,
        MARKET
    }

    public int getMinimalNumberDaysInTraveling() {
        return minimalNumberDaysInTraveling;
    }

    public int getMaximumNumberDaysInTraveling() {
        return maximumNumberDaysInTraveling;
    }
}
