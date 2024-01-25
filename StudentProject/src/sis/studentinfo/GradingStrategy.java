package sis.studentinfo;

/**
 *
 * @author emaph
 */
public interface GradingStrategy {
    double getGradePointsFor(Student.Grade grade);
}
