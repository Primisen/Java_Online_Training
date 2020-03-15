package com.primisen.programming_with_class.class_and_object.task5;

public class Main {

    public static void main(String[] args) {

        Counter.setCount();
        Counter.setCount(5);

        System.out.println(Counter.getCount());

        Counter.increment();
        Counter.increment();

        System.out.println(Counter.getCount());
    }
}