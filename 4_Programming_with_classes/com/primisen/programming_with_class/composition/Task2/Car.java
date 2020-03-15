package com.primisen.programming_with_class.composition.Task2;

public class Car {

    private String mark;
    private Wheel [] wheels;
    private Engine engine;

    public Car() {
    }

    public Car(String mark, Wheel [] wheels, Engine engine) {

        this.mark = mark;
        this.wheels = wheels;
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void drive(){

        if (!engine.getStart()) {

            engine.setStart(true);
        }
    }

    public void refuel(){ // заправиться

        if(!engine.getRefill()){

            engine.setRefill(true);
        }
    }

    public void changeWheel(int id, Wheel newWheel){

        if(id < wheels.length && id >= 0) {

            wheels[id] = newWheel;
        }
        else{
            System.out.println("Incorrect id. Try again.");
        }
    }

    public void printMark(){

        System.out.println(getMark());
    }
}
