package com.primisen.programming_with_class.class_and_object.task2;

public class Main {
    public static void main(String[] args) {

        Test2 test2 = new Test2();

        test2.setValueSecond(100);
        System.out.println("Second value(test2) = " + test2.getValueSecond());

        Test2 test21 = new Test2(4, 8);

        System.out.println("First value(test21) = " + test21.getValueFirst());
    }
}
