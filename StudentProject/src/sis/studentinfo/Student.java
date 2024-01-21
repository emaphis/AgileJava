package sis.studentinfo;

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
}
