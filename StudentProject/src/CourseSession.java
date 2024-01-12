
/**
 * Class representing a Course Session
 * @author emaph
 */
class CourseSession {
    private String department;
    private String number;
    private int numberOfStudents = 0;

    CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
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

    void enroll(Student student1) {
        numberOfStudents++;
    }

}
