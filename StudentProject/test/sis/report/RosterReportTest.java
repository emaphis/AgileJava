package sis.report;

import junit.framework.TestCase;
import sis.studentinfo.*;

/**
 * Test the Roster Report
 * @author emaph
 */
public class RosterReportTest extends TestCase {

    public void testRosterReport() {
        CourseSession session =
            new CourseSession("ENGL", "101",
                    new DateUtil().createDate(2003, 1, 6));
        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        RosterReporter report = new RosterReporter(session);
        String rosterReport = report.getRosterReport();

        //System.out.println(rosterReport);

        assertEquals(
                RosterReporter.ROSTER_REPORT_HEADER +
                "A" + RosterReporter.NEWLINE +
                "B" + RosterReporter.NEWLINE +
                RosterReporter.ROSTER_REPORT_FOOTER +
                "2" +    RosterReporter.NEWLINE,
                rosterReport);
    }

}
