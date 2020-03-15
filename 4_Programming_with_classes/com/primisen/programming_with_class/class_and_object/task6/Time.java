package com.primisen.programming_with_class.class_and_object.task6;

public class Time {

    private int second;
    private int minute;
    private int hour;

    private static final int MIN = 0;
    private static final int MAX = 59;
    private static final int MAX_HOUR = 24;
    private static final int DEFAULT_VALUE = 0;

    public Time(int second, int minute, int hour) {

        if (second >= MIN && second <= MAX) {
            this.second = second;
        } else {
            this.second = DEFAULT_VALUE;
        }

        if(minute >= MIN && minute <= MAX) {
            this.minute = minute;
        } else {
            this.minute = DEFAULT_VALUE;
        }

        if(hour <= MAX_HOUR && hour >= MIN) {
            this.hour = hour;
        } else {
            this.hour = DEFAULT_VALUE;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second){

        if (second >= MIN && second <= MAX) {
            this.second = second;
        } else {
            this.second = DEFAULT_VALUE;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute){

        if (minute >= MIN && minute <= MAX) {
            this.minute = minute;
        } else {
            this.minute = DEFAULT_VALUE;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour){

        if (hour >= MIN && hour <= MAX_HOUR) {
            this.hour = hour;
        } else {
            this.hour = DEFAULT_VALUE;
        }
    }

    public void changeSecond(int second){

        if (this.second + second <= MAX){
            this.second += second;

        } else{
            this.second = DEFAULT_VALUE;
        }
    }

    public void changeMinute(int minute){

        if (this.minute + minute <= MAX){
            this.minute += minute;

        } else{
            this.minute = DEFAULT_VALUE;
        }
    }

    public void changeHour(int hour){

        if (this.hour + hour <= MAX_HOUR){
            this.hour += hour;

        } else{
            this.hour = DEFAULT_VALUE;
        }
    }
}