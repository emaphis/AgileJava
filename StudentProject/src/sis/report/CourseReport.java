package sis.report;

import static sis.report.ReportConstant.NEWLINE;
import sis.studentinfo.*;
import java.util.*;

/**
 * Report of all course sessions
 * Sorted by department, course number.
 * @author emaph
 */
public class CourseReport {
    private ArrayList<CourseSession> sessions = new ArrayList<CourseSession>();

    void add(CourseSession session) {
        sessions.add(session);
    }

    String text() {
        Collections.sort(sessions);
        StringBuilder builder = new StringBuilder();
        for (CourseSession session : sessions) {
            builder.append(session.getDepartment());
            builder.append(" ");
            builder.append(session.getNumber());
            builder.append(NEWLINE);
        }
        return builder.toString();
    }

}
