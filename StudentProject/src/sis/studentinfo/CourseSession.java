package sis.studentinfo;

import java.util.*;


/**
 * Provides a representation of a single=semester
 * session of a specific university course
 * @author emaph
 */
public class CourseSession implements Comparable<CourseSession> {
    private static int count;

    private static void incrementCount() {
        count++;
    }

    static void resetCount() {
        count = 0;
    }

    static int getCount() {
        return count;
    }

    /**
     * CourseSession factory method
     * @param departemnt
     * @param number
     * @param startDate
     * @return new CourseSession
     */
    public static CourseSession create(String departemnt, String number, Date startDate) {
        CourseSession.incrementCount();
        return new CourseSession(departemnt, number, startDate);
    }

    private final String department;
    private final String number;
    private final List<Student> students;
    private final Date startDate;
    private int numberOfCredits;

    private CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.students = new ArrayList<Student>();
        this.startDate = startDate;
    }

    void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void enroll(Student student) {
        student.addCredits(numberOfCredits);
        students.add(student);
    }

    public Student get(int index) {
        return students.get(index);
    }

    public Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public int compareTo(CourseSession that) {
        int compare = this.getDepartment().compareTo(that.getDepartment());
        if (compare == 0)
            compare = this.getNumber().compareTo(that.getNumber());
        return compare;
    }

}
