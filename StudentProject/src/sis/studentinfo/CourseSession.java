package sis.studentinfo;

import java.util.ArrayList;
import java.util.*;


/**
 * Provides a representation of a single=semester
 * session of a specific university course
 * @author emaph
 */
public class CourseSession {
    static int count;

    private final String department;
    private final String number;
    private final ArrayList<Student> students;
    private final Date startDate;

    public CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.students = new ArrayList<Student>();
        this.startDate = startDate;
        CourseSession.count++;
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

    public ArrayList<Student> getAllStudents() {
        return students;
    }

}
