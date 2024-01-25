package sis.studentinfo;

import java.util.*;

/**
 * Represents a Student
 * @author emaph
 */
public class Student {
    public static final int CREDIT_REQUITED_FOR_FULL_TIME = 12;
    public static final String IN_STATE = "CO";

    private final String name;
    private int credits;
    private String state;
    private ArrayList<String> grades = new ArrayList<String>();

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

    void addGrade(String grade) {
        this.grades.add(grade);
    }

    double getGPA() {
        if (grades.isEmpty())
            return 0.0;

        double total = 0.0;
        for (String grade : grades) {
            if (grade.equals("A"))
                total += 4.0;
            else if (grade.equals("B"))
                total += 3.0;
            else if (grade.equals("C"))
                total += 2.0;
            else if (grade.equals("D"))
                total += 1.0;
        }

        return total / grades.size();
    }

}
