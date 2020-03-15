package com.primisen.programming_with_class.composition.Task3;

public class State { //государство

    private String capital; //исправить
    private Region [] regions;
    private double area;    //площадь

    public State() {
    }

    public State(String capital, Region [] regions, double area) {

        this.capital = capital;
        this.regions = regions;
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void printCapital(){

        System.out.println(getCapital());
    }

    public void printNumberOfRegions(){

        System.out.println("Number of regions: " + regions.length);
    }

    public void printAreaOfState(){

        System.out.println("Area of state: " + area);
    }

    public void printRegionCenters(){

        System.out.println("Regions Centers: ");

        for (int i = 0; i < regions.length; i++) {

            System.out.println(regions[i].getRegionCenter());
        }
    }
}
