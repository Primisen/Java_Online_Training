package com.primisen.programming_with_class.composition.Task4;

public class Account { //счета

    private double valueOfAccount;
    private boolean block;

    public Account(double value) {
        this.valueOfAccount = value;
    }

    public double getValueOfAccount() {
        return valueOfAccount;
    }

    public void setValueOfAccount(double valueOfAccount) {
        this.valueOfAccount = valueOfAccount;
    }

    public boolean getBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }
}
