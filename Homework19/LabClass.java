package Homework19;

import java.util.Scanner;

public class LabClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] students = new Student[4];
        students[0] = new Student("Ivanov",22,"IKBO-01-21",4.5);
        students[1] = new Student("Petrov",22,"IKBO-20-21",4.3);
        students[2] = new Student("Sidorov",20,"IKBO-24-21",4);
        students[3]= new Student("Smirnov",20,"IKBO-10-22",4.2);
        LabClassDriver labClassDriver = new LabClassDriver();
        System.out.print("Enter the name to search: ");
        Student temp  = labClassDriver.search(in.nextLine(),students);
        System.out.println(temp);

        System.out.println("\nArray before sorting:");
        for (int i = 0; i < 3; i++)
            System.out.println(students[i]);
        students = labClassDriver.sort(students);
        System.out.println("\nArray after sorting:");
        for (int i = 0; i < 3; i++)
            System.out.println(students[i]);
    }
}