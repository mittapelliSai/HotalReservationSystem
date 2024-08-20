package com.gradetracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GradeTracker gradeTracker = new GradeTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Grade");
            System.out.println("3. Print All Students");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (option == 1) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                gradeTracker.addStudent(new Student(name));
            } else if (option == 2) {
                System.out.print("Enter student name: ");
                String name = scanner.nextLine();
                Student student = gradeTracker.getStudent(name);
                if (student != null) {
                    System.out.print("Enter grade: ");
                    double grade = scanner.nextDouble();
                    student.addGrade(grade);
                } else {
                    System.out.println("Student not found.");
                }
            } else if (option == 3) {
                gradeTracker.printAllStudents();
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }

        scanner.close();
    }
}
