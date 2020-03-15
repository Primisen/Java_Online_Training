package com.primisen.basics.loop;

// Составить программу нахождения произведения квадратов первых двухсот чисел

public class Task4 {
    
    public static void main(String[] args){
        
        long multiplication = 1;
        
        for (int i = 1; i <= 200; i++){
            
            multiplication *= Math.pow(i, 2);
        }
        
        System.out.println("Result: " + multiplication);
    }
}
