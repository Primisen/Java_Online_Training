package com.primisen.basics.branching;

/*Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
он прямоугольным.*/

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        int minValueOfAngle = 0;
        int maxValueOfAngle = 180;

        int valueOfRectangularAngle = 90;

        System.out.print("Enter first angle: ");
        double firstAngle = getDouble();

        System.out.print("Enter second angle: ");
        double secondAngle = getDouble();

        boolean existFirstAngle = (firstAngle > minValueOfAngle && firstAngle < maxValueOfAngle);
        boolean existSecondAngle = (secondAngle > minValueOfAngle && secondAngle < maxValueOfAngle);
        boolean existFirstAndSecondAngles = (firstAngle + secondAngle) < maxValueOfAngle;

        boolean rectangularFirstAngle = (firstAngle == valueOfRectangularAngle);
        boolean rectangularSecondAngle = (secondAngle == valueOfRectangularAngle);
        boolean rectangularFirstAndSecondAngles = (maxValueOfAngle - (firstAngle + secondAngle) == valueOfRectangularAngle);

        if (existFirstAngle && existSecondAngle && existFirstAndSecondAngles) {

            System.out.println("The triangle is exist.");

            if (rectangularFirstAngle || rectangularSecondAngle || rectangularFirstAndSecondAngles) {

                System.out.println("Triangle is rectangular.");
            } else {

                System.out.println("Triangle is not rectangular");
            }
        } else {

            System.out.println("The triangle is not exist.");
        }
    }

    private static double getDouble(){

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextDouble()){

            System.out.println("The value is incorrect. Try again.");
            sc.next();
        }

        return sc.nextDouble();
    }
}