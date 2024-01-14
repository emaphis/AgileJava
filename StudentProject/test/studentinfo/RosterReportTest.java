package studentinfo;

import junit.framework.TestCase;
import java.util.*;

/**
 * Test the Roster Report
 * @author emaph
 */
public class RosterReportTest extends TestCase {

    public void testRosterReport() {
        CourseSession session =
            new CourseSession("ENGL", "101", createDate(2003, 1, 6));
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        RosterReporter report = new RosterReporter(session);
        String rosterReport = report.getRosterReport();

        assertEquals(
                RosterReporter.ROSTER_REPORT_HEADER +
                "A" + RosterReporter.NEWLINE +
                "B" + RosterReporter.NEWLINE +
                RosterReporter.ROSTER_REPORT_FOOTER +
                "2" +    RosterReporter.NEWLINE,
                rosterReport);
        //System.out.println(rosterReport);
    }

     Date createDate(int year, int month, int date) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, date);
        return calendar.getTime();
    }
}
