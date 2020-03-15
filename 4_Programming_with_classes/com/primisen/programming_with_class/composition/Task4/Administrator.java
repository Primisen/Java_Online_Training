package com.primisen.programming_with_class.composition.Task4;

public class Administrator {

    //модификатор final в методах здесь используется для невозможности переопределения методов из других мест программы

    public final void blockAccount(Customer customer, int numberOfBlockAccount){

        customer.getAccount(numberOfBlockAccount).setBlock(true);

    }

    public final void unblockAcount(Customer customer, int numberOfUnblockAccount){

        customer.getAccount(numberOfUnblockAccount).setBlock(false);
    }

    public final Account searchAccount(Customer customer, double valueOfSearchAccount){

        int i = 0;
        while (customer.getAccounts()[i].getValueOfAccount() != valueOfSearchAccount){

            i++;
        }

        return customer.getAccounts()[i];
    }

    public final void sortingAccount(Customer customer){

        //Inserting Sort
        for (int i = 1; i < customer.getAccounts().length; i++) {

            double currentAccount = customer.getAccount(i).getValueOfAccount(); //текущий счет

            int j = i - 1;

            while (j >= 0 && customer.getAccount(j).getValueOfAccount() > currentAccount){

                customer.getAccount(j + 1).setValueOfAccount(customer.getAccount(j).getValueOfAccount());
                j--;
            }

            customer.getAccount(j + 1).setValueOfAccount(currentAccount);
        }
    }

    public final double sumOfAllAccounts(Customer customer){

        double sum = 0;

        for (int i = 0; i < customer.getAccounts().length; i++) {

            sum += customer.getAccount(i).getValueOfAccount();
        }

        return sum;
    }

    public final double sumOfPositiveAccounts(Customer customer){

        double positiveSum = 0;

        for (int i = 0; i < customer.getAccounts().length; i++) {

            if(customer.getAccount(i).getValueOfAccount() > 0) {
                positiveSum += customer.getAccount(i).getValueOfAccount();
            }
        }

        return positiveSum;
    }

    public final double sumOfNegativeAccounts(Customer customer){

        double negativeSum = 0;

        for (int i = 0; i < customer.getAccounts().length; i++) {

            if(customer.getAccount(i).getValueOfAccount() < 0) {
                negativeSum += customer.getAccount(i).getValueOfAccount();
            }
        }

        return negativeSum;
    }
}
