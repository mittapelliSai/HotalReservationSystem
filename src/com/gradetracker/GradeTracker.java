package com.gradetracker;

import java.util.ArrayList;

public class GradeTracker {
    private final ArrayList<Student> students;

    public GradeTracker() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student getStudent(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Grades: " + student.getGrades());
            System.out.println("Average Grade: " + student.getAverageGrade());
            System.out.println("Highest Grade: " + student.getHighestGrade());
            System.out.println("Lowest Grade: " + student.getLowestGrade());
            System.out.println();
        }
    }
}
