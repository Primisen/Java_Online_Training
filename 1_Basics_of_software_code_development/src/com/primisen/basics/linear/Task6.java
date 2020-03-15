package com.primisen.basics.linear;

/*
    Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае:
*/

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {

        System.out.print("Enter x: ");
        double x = getDouble();

        System.out.print("Enter y: ");
        double y = getDouble();

        /*
        Идея такая. Мы разбиваем фигуру на две состовляющие: 1)прямоугольник над осью Ох
        и 2)на фигуру ниже оси Ох. Далее мы состовляем условие попадания точки для каждой из
        состовляющих фигур. Так же не забываем учесть, что нижняя фигура
        имеет в себе вырезанную область в виде круга.
         */

        //part 1
        int xMaxOnFirstShape = 2;
        int xMinOnFirstShape = -2;

        int yMaxOnFirstShape = 4;
        int yMinOnFirstShape = 0;

        boolean dotOnAreaOfFirstShape = (x >= xMinOnFirstShape && x <= xMaxOnFirstShape) && (y >= xMinOnFirstShape && y <= yMaxOnFirstShape);

        //part 2
        int xMaxOnSecondShape = 4;
        int xMinOnSecondShape = -4;

        int yMaxOnSecondShape = 0;
        int yMinOnSecondShape = -3;

        boolean dotOnAreaOfSecondShape = (x >= xMinOnSecondShape && x <= xMaxOnSecondShape) && (y >= xMinOnSecondShape && y <= yMaxOnSecondShape);

        //part with circle
        int centerCoordinateOfCircleX = 0;
        int centerCoordinateOfCircleY = -1;
        double radiusOfCircle = 0.5;

        boolean dotOnTheCircleArea = (Math.pow(x - centerCoordinateOfCircleX, 2) + Math.pow(y - centerCoordinateOfCircleY, 2)) < Math.pow(radiusOfCircle, 2);

        if((dotOnAreaOfFirstShape || dotOnAreaOfSecondShape) && !dotOnTheCircleArea){

            System.out.println("true");
        } else {

            System.out.println("false");
        }

    }

    private static double getDouble (){

        Scanner sc = new Scanner(System.in);

        while(!sc.hasNextDouble()){

            System.out.println("The value is incorrect. Try again.");
            sc.next();
        }

        return sc.nextDouble();
    }
}