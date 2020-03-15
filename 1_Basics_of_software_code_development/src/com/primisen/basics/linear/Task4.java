package com.primisen.basics.linear;

/*
    Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа.
*/

public class Task4 {

    public static void main(String[] args) {

        double inputValue = 444.333;

        double partBeforeDot = (int) inputValue;

        double partAfterDot = (inputValue - partBeforeDot) * 1000;

        double modifyValue = partAfterDot + partBeforeDot / 1000;

        System.out.printf("Result: %.3f", modifyValue);
    }
}