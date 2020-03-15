package com.primisen.programming_with_class.composition.Task4;

public class Customer {

    private Account [] accounts;

    public Account[] getAccounts() {
        return accounts;
    }

    public Account getAccount(int i){ //для получения определенного счета
        return accounts[i];
    }

}
