package com.primisen.programming_with_class.class_and_object.task5;

public class Counter {

    private static int count;
    private static final int MAX = 10;
    private static final int MIN = 0;
    private static final int DEFAULT_VALUE = 0;

    public static int getCount() {
        return count;
    }

    public static void setCount(){
        count = DEFAULT_VALUE;
    }

    public static void setCount(int count) {
        if (count <= MAX && count >= MIN) {
            Counter.count = count;
        } else {
            Counter.count = DEFAULT_VALUE;
        }
    }

    public static void increment() {

        if (count < MAX) {
            ++count;
        } else {
            System.out.println("This operation is impossible.");
        }
    }

    public static void decrement() {

        if (count > MIN) {
            --count;
        } else {
            System.out.println("This operation is impossible.");
        }
    }
}