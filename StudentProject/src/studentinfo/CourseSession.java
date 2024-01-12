package studentinfo;

import java.util.ArrayList;


/**
 * Class representing a Course Session
 * @author emaph
 */
class CourseSession {
    private String department;
    private String number;
    private ArrayList<Student> students;

    CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
        this.students = new ArrayList<Student>();
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

    void enroll(Student student) {
        students.add(student);
    }

    Student get(int index) {
        return students.get(index);
    }

}
