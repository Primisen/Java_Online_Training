package com.primisen.basic_of_oop.task3;

public class Calendar {

    private int day;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {

        if(day > 0 && day < 31) {
            this.day = day;
        }
        else{
            System.out.println("You tried to set wrong date. Try again.");
        }
    }

    public static class Holiday{

        private int [] holiday;

        public Holiday(int [] holiday){
            this.holiday = holiday;
        }
    }
}
