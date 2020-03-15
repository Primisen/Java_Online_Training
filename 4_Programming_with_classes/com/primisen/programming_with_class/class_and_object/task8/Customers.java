package com.primisen.programming_with_class.class_and_object.task8;

import java.util.Scanner;

public class Customers {

    Customer [] customers;

    public Customers(Customer[] customers){

        this.customers = customers;

        createObjects();
    }

    public void createObjects(){

        for (int i = 0; i < customers.length; i++) {

            System.out.print("Enter first name: ");
            String firstName = inputStringValue();

            System.out.print("Enter second name: ");
            String secondName = inputStringValue();

            System.out.print("Enter patronymic: ");
            String patronymic = inputStringValue();

            System.out.print("Enter address: ");
            String address = inputStringValue();

            System.out.print("Credit card number: ");
            Long creditCardNumber = inputLongValue();

            System.out.print("Bank account number: ");
            int bankAccountNumber = inputIntValue();

            customers[i] = new Customer(firstName, secondName, patronymic, address, creditCardNumber, bankAccountNumber);
        }
    }

    public int inputIntValue(){

        Scanner scanner = new Scanner(System.in);

        int value;

        do{

            while (!scanner.hasNextInt()){
                scanner.next();
            }

            value = scanner.nextInt();
        }while (value < 0);

        return value;
    }

    public String inputStringValue() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public long inputLongValue() {

        Scanner scanner = new Scanner(System.in);

        long value;

        do {

            while (!scanner.hasNextLong()) {
                scanner.next();
            }

            value = scanner.nextLong();
        } while (value < 0);

        return value;
    }

    public void alphabeticallySorting(){

        String [] secondName = getSecondNameArray();

        for (int i = 0; i < secondName.length; i++) {

            for (int j = i + 1; j < secondName.length; j++) {
                if (secondName[i].compareTo(secondName[j]) > 0) {

                    Customer buf = customers[i];
                    customers[i] = customers[j];
                    customers[j] = buf;
                }
            }
        }
    }

    public Customer[] creditCardInInterval(long leftInterval, long rightInterval){

        long [] creditCardNumber = new long [customers.length];

        for (int i = 0; i < creditCardNumber.length; i++) {
            creditCardNumber[i] = customers[i].getCreditCardNumber();
        }

        //get length of new array
        int newLength = 0;

        for (int i = 0; i < creditCardNumber.length; i++) {

            if(creditCardNumber[i] <= rightInterval && creditCardNumber[i] >= leftInterval){
                newLength++;
            }
        }

        Customer[] creditCardsNumberInInterval = new Customer[newLength];

        int index = -1;

        for (int i = 0; i < creditCardNumber.length; i++) {

            if(creditCardNumber[i] <= rightInterval && creditCardNumber[i] > leftInterval){
                index++;
                creditCardsNumberInInterval[index] = customers[i];
            }
        }

        return creditCardsNumberInInterval;
    }

    public String[] getSecondNameArray() {

        String[] secondName = new String[customers.length];

        for (int i = 0; i < secondName.length; i++) {
            secondName[i] = customers[i].getSecondName();
        }

        return secondName;
    }

    public void printCustomers() {

        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }
    }

    public void printCustomers(Customer [] customers){

        for (int i = 0; i < customers.length; i++) {

            System.out.println(customers[i]);
        }
    }
}
