package studentinfo;

import java.util.ArrayList;
import java.util.*;


/**
 * Provides a representation of a single=semester
 * session of a specific university course
 * @author emaph
 */
class CourseSession {
    public static final String NEWLINE =
            System.getProperty("line.separator");
    public static final String ROSTER_REPORT_HEADER =
            "Student" + NEWLINE +"--------------" + NEWLINE;
    public static final String ROSTER_REPORT_FOOTER =
            NEWLINE + "# students = ";

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

    String getRosterReport() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(ROSTER_REPORT_HEADER);

        for (Student student : students) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }

        buffer.append(ROSTER_REPORT_FOOTER);
        buffer.append(students.size());
        buffer.append( NEWLINE);

        return buffer.toString();
    }

}
