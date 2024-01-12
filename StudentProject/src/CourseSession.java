
/**
 *
 * @author emaph
 */
class CourseSession {
    private String department;
    private String number;

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

}
