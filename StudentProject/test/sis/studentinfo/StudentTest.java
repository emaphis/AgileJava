package sis.studentinfo;

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

    public void testStudentStatus() {
        Student student = new Student("a");
        assertEquals(0, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(3);
        assertEquals(3, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(4);
        assertEquals(7, student.getCredits());
        assertFalse(student.isFullTime());

        student.addCredits(5);
        assertEquals(Student.CREDIT_REQUITED_FOR_FULL_TIME,
                student.getCredits());
        assertTrue(student.isFullTime());
    }

    public void testInState() {
        Student student = new Student("a");
        assertFalse(student.isInState());
        student.setState(student.IN_STATE);
        assertTrue(student.isInState());
        student.setState("MO");
        assertFalse(student.isInState());
    }
}
