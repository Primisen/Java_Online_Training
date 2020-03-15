package com.primisen.algorithmization.method;

/*
На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.
 */

import static java.lang.Math.*;

public class Task4 {

    public static void main(String[] args) {

        int [][] coordinates = {
                {1, 9, 3},
                {1, 8, 7}};

        double maxDistance = 0;
        int [] x = new int [2];
        int [] y = new int [2];

        for (int i = 0; i < coordinates[0].length; i++) {

            for (int j = 0; j < coordinates[1].length; j++) {

                if (distance(coordinates[0][i], coordinates[1][i], coordinates[0][j], coordinates[1][j]) > maxDistance){

                    maxDistance = distance(coordinates[0][i], coordinates[1][i], coordinates[0][j], coordinates[1][j]);

                    x[0] = coordinates[0][i];
                    y[0] = coordinates[1][i];

                    x[1] = coordinates[0][j];
                    y[1] = coordinates[1][j];
                }
            }
        }

        System.out.println("Max distance: " + maxDistance);
        System.out.println("Between: (" + x[0] + "; " + y[0] + ") (" + x[1] + "; " + y[1] + ")");
    }

    private static double distance(int x1, int y1, int x2, int y2){

        return sqrt(pow(abs(x1 - x2), 2) + pow(abs(y1 - y2), 2));
    }
}
