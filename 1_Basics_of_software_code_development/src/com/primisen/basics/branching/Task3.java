package com.primisen.basics.branching;

// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Coordinates dot A.");

        System.out.print("Enter x1: ");
        double x1 = getDouble();

        System.out.print("Enter y1: ");
        double y1 = getDouble();

        System.out.println("Coordinates dot B.");

        System.out.print("Enter x2: ");
        double x2 = getDouble();

        System.out.print("Enter y2: ");
        double y2 = getDouble();

        System.out.println("Coordinates dot C.");

        System.out.print("Enter x3: ");
        double x3 = getDouble();

        System.out.print("Enter y3: ");
        double y3 = getDouble();

        if ((y1 - y2) / (y3 - y2) == (x1 - x2) / (x3 - x2)) {

            System.out.println("All points belong on the same line.");

        } else if (x1 == x2 && x2 == x3 && y1 != y3) { //выходит вертикальная прямая, где х1 = х2 = х3, при этом у не равны

            System.out.println("All points belong on the same line.");

        } else if (y1 == y2 && y2 == y3 && x1 != x3) { //горизонтальная прямая, где y1 = y2 = y3, при этом х не равны

            System.out.println("All points belong on the same line.");

        } else {

            System.out.println("Points not belong on the same line.");
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