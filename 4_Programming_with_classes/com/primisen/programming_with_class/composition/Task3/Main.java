package com.primisen.programming_with_class.composition.Task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        State state = new State("Minsk", new Region[5], 55, new City[5]);

        Region [] regions = new Region[6];

        City[] regionsCenters = new City[6];

        Scanner sc = new Scanner(System.in);

        double areaOfBelarus = 207.595;

        for (int i = 0; i < regions.length; i++) {

            regions[i] = new Region();
        }

        for (int i = 0; i < regions.length; i++) {

            regions[i].setName(sc.nextLine());
        }

        for (int i = 0; i < regionsCenters.length; i++) {

            regionsCenters[i] = new City();
        }

        for (int i = 0; i < regionsCenters.length; i++) {

            regionsCenters[i].setName(sc.nextLine());
        }

        State belarus = new State("Minsk", regions, areaOfBelarus, regionsCenters);

        belarus.printCapital();
        belarus.printNumberOfRegions();
        belarus.printAreaOfState();
        belarus.printRegionCenters();
    }
}
