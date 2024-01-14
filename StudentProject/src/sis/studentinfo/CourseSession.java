package sis.studentinfo;

import java.util.ArrayList;
import java.util.*;


/**
 * Provides a representation of a single=semester
 * session of a specific university course
 * @author emaph
 */
class CourseSession {

    private String department;
    private String number;
    private ArrayList<Student> students;
    private Date startDate;

    CourseSession(String department, String number, Date startDate) {
        this.department = department;
        this.number = number;
        this.students = new ArrayList<Student>();
        this.startDate = startDate;
    }

    String getDepartment() {
        return department;
    }

    String getNumber() {
        return number;
    }

    int getNumberOfStudents() {
        return students.size();
    }

    Date getStartDate() {
        return startDate;
    }

    void enroll(Student student) {
        students.add(student);
    }

    Student get(int index) {
        return students.get(index);
    }

    Date getEndDate() {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(startDate);
        int numberOfDays = 16 * 7 - 3;
        calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
        return calendar.getTime();
    }

    ArrayList<Student> getAllStudents() {
        return students;
    }

}
