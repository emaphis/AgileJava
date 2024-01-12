
import junit.framework.TestCase;

/**
 * Test the CourseSession class
 * @author emaph
 */
public class CourseSessionTest extends TestCase {

    public void testCreate() {
        CourseSession session = new CourseSession("ENGL", "101");
        assertEquals("ENGL", session.getDepartment());
        assertEquals("101", session.getNumber());
        assertEquals(0, session.getNumberOfStudents());
    }

    public void testEnrollStudents() {
        CourseSession session = new CourseSession("ENGL", "101");

        Student student1 = new Student("Cain DiVoe");
        session.enroll(student1);
        assertEquals(1, session.getNumberOfStudents());

        Student student2 = new Student("Coralee DeVaughn");
        session.enroll(student2);
        assertEquals(2, session.getNumberOfStudents());
    }
}
