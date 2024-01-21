package sis.studentinfo;

/**
 * Represents a Student
 * @author emaph
 */
public class Student {
    public static final int CREDIT_REQUITED_FOR_FULL_TIME = 12;

    private final String name;
    private int credits;

    public Student(String name) {
        this.name = name;
        this.credits = 0;
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
}
