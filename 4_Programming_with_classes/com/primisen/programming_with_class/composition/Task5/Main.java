package com.primisen.programming_with_class.composition.Task5;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();

        customer.setNumberOfDaysInTraveling(16);
        customer.setTransport("CAR");
        customer.setNutrition("CAFE");

        customer.getVariantOfTraveling();
    }
}
