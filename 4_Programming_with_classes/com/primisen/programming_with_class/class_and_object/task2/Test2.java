package com.primisen.programming_with_class.class_and_object.task2;

public class Test2 {

    private float valueFirst;
    private float valueSecond;

    public Test2(){

        valueFirst = 0;
        valueSecond = 0;
    }

    public Test2(float valueFirst, float valueSecond){

        this.valueFirst = valueFirst;
        this.valueSecond = valueSecond;
    }

    public float getValueFirst() {
        return valueFirst;
    }

    public void setValueFirst(float valueFirst) {
        this.valueFirst = valueFirst;
    }

    public float getValueSecond() {
        return valueSecond;
    }

    public void setValueSecond(float valueSecond) {
        this.valueSecond = valueSecond;
    }
}
