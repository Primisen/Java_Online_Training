package com.primisen.algorithmization.method;

/*
    Вычислить площадь правильного шестиугольника со стороной а,
    используя метод вычисления площади треугольника
 */
public class Task3 {

    public static void main(String[] args) {

        int a = 4;

        System.out.println("Area: "  + area(a));
    }

    private static double area(int a){

        double area = (Math.pow(a, 2)*Math.sqrt(3))/4;
        return area * 6;
    }
}