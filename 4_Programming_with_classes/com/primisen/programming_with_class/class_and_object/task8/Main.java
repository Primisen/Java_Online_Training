package com.primisen.programming_with_class.class_and_object.task8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Customer[] customer = new Customer[2];
        Customers customers = new Customers(customer);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a or b: ");
        String choice = scanner.nextLine();
        if (choice.equals("a")) {

            customers.alphabeticallySorting();
            customers.printCustomers();
        }
        if (choice.equals("b")) {
            customers.printCustomers(customers.creditCardInInterval(1_000_000, 4_000_000));
        }
    }
}
