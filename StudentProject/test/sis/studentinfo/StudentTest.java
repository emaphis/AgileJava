package sis.studentinfo;

import sis.studentinfo.Student;
import junit.framework.TestCase;

/**
 * Tests Student class
 * @author emaph
 */
public class StudentTest extends TestCase {
    final String firstStudentName = "Jane Doe";
    final String secondStudentName = "Joe Blow";

    public void testCreate() {
        Student student = new Student(firstStudentName);
        assertEquals(firstStudentName, student.getName());

        Student secondStudent = new Student(secondStudentName);
        assertEquals(secondStudentName, secondStudent.getName());

        assertEquals(firstStudentName, student.getName());
    }

}
