package com.primisen.algorithmization.one_dimensional_array;

/*
    Даны действительные числа а1, а2,..,аn.
    Вывести на печать только те числа, для которых ai > i.
*/

public class Task5 {
    
    public static void main(String[] args){

        double [] array = {-10.4, 5.31, -1.069, 0, 4.6342, 7.325};

        for(int i = 0; i < array.length; i++){
            
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
