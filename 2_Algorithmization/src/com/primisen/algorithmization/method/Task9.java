package com.primisen.algorithmization.method;

//решено без учета наличия прямого угла

/*
 Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади,
если угол между сторонами длиной X и Y— прямой.
 */
public class Task9 {

    public static void main(String[] args) {

        double x = 4.5;
        double y = 5.2;
        double z = 6.8;
        double t = 4.1;

        /*
        Идея решения такова. Разбить предложенный четырехугольник на два треугольника,
         один из которых получится прямоугольным. Треугольники будут иметь общую сторону,
         которая для прямоугольного треугольника будет являться гипотенузой.
         Вычислив площади обоих треугольников и сложив эти площади мы найдем площадь четырехугольника.
         */

        double commonSide = findingTheHypotenuseOfRightTriangle(x, y); //общая сторона

        double areaOfFirstTriangle = triangleArea(x, y, commonSide);
        double areaOfSecondTriangle = triangleArea(z, t, commonSide);

        System.out.println("Area of shape: " + (areaOfFirstTriangle + areaOfSecondTriangle));
    }

    private static double triangleArea(double a, double b, double c){

        double p = (a + b + c)/2; //полупериметр

        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        return area;
    }

    private static double findingTheHypotenuseOfRightTriangle(double a, double b){ //нахождение гипотенузы прямоугольного треугольника

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        return c;
    }
}
