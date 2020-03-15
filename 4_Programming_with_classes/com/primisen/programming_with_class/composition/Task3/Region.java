package com.primisen.programming_with_class.composition.Task3;

//конструктор

public class Region {

    private String name;
    private Area [] areas; //районы
    private City[] regionCenter;

    public Region() {
    }

    public Region(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Area[] getAreas() {
        return areas;
    }

    public City[] getRegionCenter() {
        return regionCenter;
    }
}
