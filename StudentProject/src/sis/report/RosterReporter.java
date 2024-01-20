package sis.report;

import sis.studentinfo.*;
import static sis.report.ReportConstant.NEWLINE;

/**
 * Produce a Roster Report of Students
 * @author emaph
 */
public class RosterReporter {
    static final String ROSTER_REPORT_HEADER =
            "Student" + NEWLINE +"--------------" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER =
            NEWLINE + "# students = ";

    private final CourseSession session;

    public RosterReporter(CourseSession session) {
        this.session = session;
    }

    String getRosterReport() {
        StringBuilder buffer = new StringBuilder();
        writeHeader(buffer);
        writeBody(buffer);
        writeFooter( buffer);

        return buffer.toString();
    }

    private void writeHeader(StringBuilder buffer) {
        buffer.append(ROSTER_REPORT_HEADER);
    }

    private void writeBody(StringBuilder buffer) {
        for (Student student : session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }
    }

    private void writeFooter(StringBuilder buffer) {
        buffer.append(ROSTER_REPORT_FOOTER);
        buffer.append(session.getAllStudents().size());
        buffer.append(NEWLINE);
    }

}
