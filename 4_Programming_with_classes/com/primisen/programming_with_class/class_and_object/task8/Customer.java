package com.primisen.programming_with_class.class_and_object.task8;

public class Customer {

    private static int id = -1;
    private String firstName;
    private String secondName;
    private String patronymic; //отчество
    private String address;
    private long creditCardNumber;
    private int bankAccountNumber;

    public Customer(){
    }

    public Customer(String firstName, String secondName, String patronymic,
                    String address, long creditCardNumber, int bankAccountNumber){

        Customer.id++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public static int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public String toString(){

        return new String("Customer [id = " + id + ". First Name:  " + getFirstName() + ". Second Name: "  +
                getSecondName() + ". Patronymic:  " + getPatronymic() + ". Address: " + getAddress() +
                ". Credit Card Number: " + getCreditCardNumber() + ". Bank Account Number: " +
                getBankAccountNumber() + "]");
    }
}