package com.primisen.programming_with_class.class_and_object.task1;

public class Test1 {

    private int valueFirst;  //инициализация поля по умолчанию
    private int valueSecond;

    public Test1(int valueFirst, int valueSecond){

        this.valueFirst = valueFirst;
        this.valueSecond = valueSecond;
    }

    public void print() {

        System.out.println("Value 1: " + valueFirst);
        System.out.println("Value 2: " + valueSecond);
    }

    public void change() {

        valueFirst = (int) Math.pow(valueFirst, 2);
        valueSecond = (int) Math.pow(valueSecond, 2);
    }

    public int sum() {

        return valueFirst + valueSecond;
    }

    public int max() {

        int max = valueFirst;

        if (valueFirst < valueSecond) {

            max = valueSecond;
        }

        return max;
    }
}