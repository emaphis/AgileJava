package sis.studentinfo;

import java.util.*;

/**
 * Represents a Student
 * @author emaph
 */
public class Student {
    enum Grade { A, B, C, D, F };

    public static final int CREDIT_REQUITED_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "CO";

    private final String name;
    private int credits;
    private String state;
    private final ArrayList<Grade> grades = new ArrayList<Grade>();

    public Student(String name) {
        this.name = name;
        this.credits = 0;
        this.state = "";
    }

    public String getName() {
        return name;
    }

    boolean isFullTime() {
       return getCredits() >= CREDIT_REQUITED_FOR_FULL_TIME;
    }

    int getCredits() {
        return credits;
    }

    void addCredits(int credits) {
        this.credits += credits;
    }

    boolean isInState() {
        return this.state.equals(Student.IN_STATE);
    }

    void setState(String state) {
        this.state = state;
    }

    void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    /**
     * Calculate the GPA for this student based on stored grades
     * @return the GPAS
     */
    double getGPA() {
        if (grades.isEmpty())
            return 0.0;

        double total = 0.0;
        for (Grade grade : grades) {
            total += gradePointsFor(grade);
        }

        return total / grades.size();
    }

    /**
     * Return points given a letter grade
     * @param grade as a String
     * @return grade as points
     */
    private double gradePointsFor(Grade grade) {
        if (grade == Grade.A) return 4.0;
        if (grade == Grade.B) return 3.0;
        if (grade == Grade.C) return 2.0;
        if (grade == Grade.D) return 1.0;
        return 0;
    }

}
