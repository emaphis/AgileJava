
import java.util.ArrayList;


/**
 * Class representing a Course Session
 * @author emaph
 */
class CourseSession {
    private String department;
    private String number;
    private int numberOfStudents;
    private ArrayList<Student> students;

    CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
        this.numberOfStudents = 0;
        this.students = new ArrayList<Student>();
    }

    String getDepartment() {
        return department;
    }

    String getNumber() {
        return number;
    }

    int getNumberOfStudents() {
        return numberOfStudents;
    }

    void enroll(Student student) {
        students.add(student);
        numberOfStudents++;
    }

    ArrayList<Student> getAllStudents() {
        return students;
    }

}
