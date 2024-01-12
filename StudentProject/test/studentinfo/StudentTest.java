package studentinfo;

import junit.framework.TestCase;

/**
 * Tests Student class
 * @author emaph
 */
public class StudentTest extends TestCase {

    public void testCreate() {
        final String firstStudentName = "Jane Doe";
        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName, student.getName());

        final String secondStudentName = "Joe Blow";
        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName, student.getName());
    }

}
