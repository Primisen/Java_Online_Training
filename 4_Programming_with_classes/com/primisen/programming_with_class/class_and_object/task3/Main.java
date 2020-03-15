package com.primisen.programming_with_class.class_and_object.task3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student [] student = new Student[10];

        createObjectsArray(student);

        for (int i = 0; i < student.length; i++) {

            student[i].findGoodAcademicPerformance();
        }
    }

    private static void createObjectsArray(Student [] student){

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < student.length; i++) {

            System.out.print("Enter lastName: ");
            String lastNme = scanner.nextLine();

            System.out.print("Enter initials: ");
            String initials = scanner.nextLine();

            System.out.print("Enter number of group: ");
            String groupNumber = scanner.nextLine();

            System.out.print("Academic performance: ");

            Scanner scanner1 = new Scanner(System.in);
            int [] academicPerformance = new int[Student.getAcademicPerformanceLength()];
            for (int j = 0; j <Student.getAcademicPerformanceLength() ; j++) {

                do {
                    while (!scanner1.hasNextInt()) {
                        scanner1.next();
                    }
                    academicPerformance[j] = scanner1.nextInt();

                }while (academicPerformance[j] > 10 || academicPerformance[j] < 0);
            }

            student[i] = new Student(lastNme, initials, groupNumber, academicPerformance);
        }
    }
}
