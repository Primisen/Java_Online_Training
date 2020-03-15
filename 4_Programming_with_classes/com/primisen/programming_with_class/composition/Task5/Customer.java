package com.primisen.programming_with_class.composition.Task5;

public class Customer {

    private int numberOfDaysInTraveling;
    private String transport;
    private String nutrition;

    public int getNumberOfDaysInTraveling() {
        return numberOfDaysInTraveling;
    }

    public void setNumberOfDaysInTraveling(int numberOfDaysInTraveling) {
        this.numberOfDaysInTraveling = numberOfDaysInTraveling;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    public void getVariantOfTraveling(){


    }
}

enum Voucher{

    TOUR,

}
