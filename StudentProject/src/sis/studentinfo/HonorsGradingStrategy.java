
package sis.studentinfo;

/**
 * Implements HonorsSdtudent grading strategy
 * @author emaph
 */
public class HonorsGradingStrategy implements GradingStrategy {
/**
     * Return points given a letter grade
     * @param grade as a String
     * @return grade as points
     */
    public double getGradePointsFor(Student.Grade grade) {
        double points = basicGradePointsFor(grade);
        if (points > 0.0)
            points += 1.0;
        return points;
    }

    private double basicGradePointsFor(Student.Grade grade) {
        if (grade == Student.Grade.A) return 4.0;
        if (grade == Student.Grade.B) return 3.0;
        if (grade == Student.Grade.C) return 2.0;
        if (grade == Student.Grade.D) return 1.0;
        return 0;
    }

}
