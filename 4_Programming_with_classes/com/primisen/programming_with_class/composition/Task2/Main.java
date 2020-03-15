package com.primisen.programming_with_class.composition.Task2;

public class Main {

    public static void main(String[] args) {

        Wheel[] wheels = new Wheel[4];
        Engine engine = new Engine();

        int idOfWheel = 2;

        Car car = new Car("Mersedes", wheels, engine);

        car.drive();

        car.refuel();

        car.printMark();

        car.changeWheel(idOfWheel, new Wheel());

    }
}
