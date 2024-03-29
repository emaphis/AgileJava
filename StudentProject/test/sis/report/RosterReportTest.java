package sis.report;

import junit.framework.TestCase;
import sis.studentinfo.*;
import static sis.report.ReportConstant.NEWLINE;

/**
 * Test the Roster Report
 * @author emaph
 */
public class RosterReportTest extends TestCase {

    public void testRosterReport() {
        CourseSession session =
            CourseSession.create("ENGL", "101",
                    DateUtil.createDate(2003, 1, 6));

        session.enroll(new Student("A"));
        session.enroll(new Student("B"));

        RosterReporter report = new RosterReporter(session);
        String rosterReport = report.getRosterReport();

        assertEquals(
                RosterReporter.ROSTER_REPORT_HEADER +
                "A" + NEWLINE +
                "B" + NEWLINE +
                RosterReporter.ROSTER_REPORT_FOOTER +
                "2" + NEWLINE,
                rosterReport);

        System.out.println(rosterReport);
    }

}
