package com.primisen.basic_of_oop.task2;

public class Main {

    public static void main(String[] args) {

        Payment payment = new Payment();

        String [] purchases = {"boll, glasses, paper"}; //покупки

        Payment.Basket basket = payment.new Basket(purchases);

        payment.setPrice(basket.commonPrise());

        payment.pay();
    }
}
