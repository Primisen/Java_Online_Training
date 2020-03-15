package com.primisen.programming_with_class.class_and_object.task3;

public class Student {

    private String lastName;
    private String initials;

    private String groupNumber;
    private static int academicPerformanceLength = 5;
    private int[] academicPerformance = new int[academicPerformanceLength];

    public Student(String lastName, String initials, String groupNumber, int [] academicPerformance) {

        this.lastName = lastName;
        this.initials = initials;
        this.groupNumber = groupNumber;

        for (int i = 0; i < academicPerformance.length; i++) {

            this.academicPerformance[i] = academicPerformance[i];
        }
    }

    public static int getAcademicPerformanceLength(){

        return academicPerformanceLength;
    }


    public void findGoodAcademicPerformance(){

        boolean good = true;

        for (int i = 0; i < academicPerformance.length; i++) {

            if (academicPerformance[i] < 9){

                good = false;
            }
        }

        if(good){

            print();
        }
    }

    public void print() {

        System.out.println(lastName);
        System.out.println(groupNumber);
    }
}
