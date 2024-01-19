package sis.studentinfo;

import java.util.*;
import junit.framework.TestCase;

/**
 * Test the CourseSession class
 * @author emaph
 */
public class CourseSessionTest extends TestCase {
    private CourseSession session;
    private Date startDate;

    @Override
    public void setUp() {
        startDate = DateUtil.createDate(2003, 1, 6);
        session = createCourseSession();
        CourseSession.count = 0;
    }

    public void testCreate() {
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
        assertEquals(startDate, session.getStartDate());
    }

    public void testEnrollStudents() {
        Student student1 = new Student("Cain DiVoe");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));

        Student student2 = new Student("Coralee DeVaughn");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
        assertEquals(student1, session.get(0));
        assertEquals(student2, session.get(1));
    }

    public void testCourseDates() {
        Date sixteenWeeksOut = DateUtil.createDate(2003, 4, 25);
        assertEquals(sixteenWeeksOut, session.getEndDate());
    }

    public void testCount() {
        CourseSession.count = 0;
        createCourseSession();
        assertEquals(1, CourseSession.count);
        createCourseSession();
        assertEquals(2, CourseSession.count);
    }

    private CourseSession createCourseSession() {
        return new CourseSession("ENGL", "101", startDate);
    }
}
