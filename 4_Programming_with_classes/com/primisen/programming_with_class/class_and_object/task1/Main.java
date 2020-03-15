package com.primisen.programming_with_class.class_and_object.task1;

public class Main {

    public static void main(String[] args) {

        Test1 test1 = new Test1(3, 5);
        test1.print();

        test1.change();
        test1.print();

        System.out.println("Sum = " + test1.sum());

        System.out.println("Max = " + test1.max());

    }
}
