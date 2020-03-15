package com.primisen.programming_with_class.class_and_object.task7;

public class Triangle {

    private int a;
    private int b;
    private int c;

    private int defaultValue = 0;

    public Triangle(int a, int b, int c){

        if(a + b > c || a + c > b || b + c > a){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        else{
            System.out.println("The triangle is not exist. Enter correct a, b, c.");
            this.a = defaultValue;
            this.b = defaultValue;
            this.c = defaultValue;
        }
    }

    public int perimeter() {

        int perimeter = 0;

        if (this.a == defaultValue || this.b == defaultValue || this.c == defaultValue){
            System.out.println("Find perimeter is impossible. Enter correct a, b, c.");

        } else {
            perimeter = a + b + c;
        }

        return perimeter;
    }

    public double area(){

        double area = 0;

        if (this.a == defaultValue || this.b == defaultValue || this.c == defaultValue){
            System.out.println("Find area is impossible. Enter correct a, b, c.");

        } else {
            double p = (a + b + c) / 2;
            area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }

        return area;
    }

    //от вершины
    public double medianPoint(){

        double medianPoint = 0;

        if (this.a == defaultValue || this.b == defaultValue || this.c == defaultValue){
            System.out.println("Operation is impossible. Enter correct a, b, c.");

        } else {
            double median = 0.5 * Math.sqrt(2 * b ^ 2 + 2 * c ^ 2 - a ^ 2);
            medianPoint = median / 3 * 2;
        }

        return medianPoint;
    }
}