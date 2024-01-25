package sis.studentinfo;

import java.util.*;

/**
 * Represents a Student
 * @author emaph
 */
public class Student {
    public enum Grade { A, B, C, D, F };

    public static final int CREDIT_REQUITED_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "CO";

    private final String name;
    private int credits;
    private String state;
    private GradingStrategy gradingStretegy;
    private final List<Grade> grades = new ArrayList<Grade>();

    public Student(String name) {
        this.name = name;
        this.credits = 0;
        this.state = "";
        this.gradingStretegy = new RegularGradingStrategy();
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

    void setGradingStrategy(GradingStrategy gradingStrategy) {
        this.gradingStretegy = gradingStrategy;
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
            total += gradingStretegy.getGradePointsFor(grade);
        }

        return total / grades.size();
    }

}
