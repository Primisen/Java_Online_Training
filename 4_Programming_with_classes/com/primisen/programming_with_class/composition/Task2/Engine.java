package com.primisen.programming_with_class.composition.Task2;

public class Engine { //двигатель

    private boolean start;
    private boolean refill; //заправка

    public boolean getStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }

    public boolean getRefill() {
        return refill;
    }

    public void setRefill(boolean refill) {
        this.refill = refill;
    }
}
