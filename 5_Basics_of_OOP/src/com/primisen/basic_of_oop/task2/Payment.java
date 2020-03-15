package com.primisen.basic_of_oop.task2;

public class Payment { //платеж

    private double price;
    private String goods;

    public Payment(){}

    public Payment(String goods){

        this.goods = goods;
    }

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void pay() {
        System.out.println("Payment is successful.");
    }

    class Basket{ //корзина

        private String [] goods; //товары

        private double priseOfGoods;

        public Basket(String [] goods){

            this.goods = goods;
        }

        public double commonPrise(){ //суммирующая цена за все товары

            double commonPrise = 0;

            for (int i = 0; i < goods.length; i++) {
            }

            return commonPrise;

        }
    }


}
