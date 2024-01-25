package sis.studentinfo;

import junit.framework.TestCase;

/**
 * Tests Student class
 * @author emaph
 */
public class StudentTest extends TestCase {
    final String firstStudentName = "Jane Doe";
    final String secondStudentName = "Joe Blow";
    private static final double GRADE_TOLERANCE     = 0.05;

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

    public void testCalulateGPA() {
        Student student = new Student("a");
        assertEquals(0.0, student.getGPA(), GRADE_TOLERANCE);
        student.addGrade("A");
        assertEquals(4.0, student.getGPA(), GRADE_TOLERANCE);
        student.addGrade("B");
        assertEquals(3.5, student.getGPA(), GRADE_TOLERANCE);
        student.addGrade("C");
        assertEquals(3.0, student.getGPA(), GRADE_TOLERANCE);
        student.addGrade("D");
        assertEquals(2.5, student.getGPA(), GRADE_TOLERANCE);
        student.addGrade("F");
        assertEquals(2.0, student.getGPA(), GRADE_TOLERANCE);


    }

}
