package studentinfo;

/**
 * Produce a Roster Report of Students
 * @author emaph
 */
public class RosterReporter {
    static final String NEWLINE =
            System.getProperty("line.separator");
    static final String ROSTER_REPORT_HEADER =
            "Student" + NEWLINE +"--------------" + NEWLINE;
    static final String ROSTER_REPORT_FOOTER =
            NEWLINE + "# students = ";

    private CourseSession session;

    public RosterReporter(CourseSession session) {
        this.session = session;
    }


    String getRosterReport() {
        StringBuilder buffer = new StringBuilder();

        buffer.append(ROSTER_REPORT_HEADER);

        for (Student student : session.getAllStudents()) {
            buffer.append(student.getName());
            buffer.append(NEWLINE);
        }

        buffer.append(ROSTER_REPORT_FOOTER);
        buffer.append(session.getAllStudents().size());
        buffer.append( NEWLINE);

        return buffer.toString();
    }
}
