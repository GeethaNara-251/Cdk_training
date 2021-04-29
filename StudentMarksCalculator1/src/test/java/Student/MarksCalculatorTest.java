package Student;
import org.junit.Before;
import org.junit.Test;
import Student.StudentMarks;
import Student.MarksCalculator;
import Student.StudentData;
import static org.junit.Assert.*;


public class MarksCalculatorTest
{
    private MarksCalculator mrkCal;
    private StudentData student;
    private StudentMarks mark;
    @Before
    public void setUp() {
        mrkCal = new MarksCalculator();
        mark = new StudentMarks(20, 40, 60);
        student = new StudentData(1, "geetha", mark);
    }
    @Test
    public void totalMarksForValidStudent() {
        double total = mrkCal.CalculateTotal(student);
        assertEquals(120.0, total,0.0);
    }
    @Test
    public void totalMarksForInvalidStudent() {
        double total = mrkCal.CalculateTotal(null);
        assertEquals(0.0, total,0.0);
    }
    @Test
    public void totalMarksForInvalidMarks() {
        student.setStudentmarks(null);
        double total = mrkCal.CalculateTotal(student);
        assertEquals(0.0, total,0.0);
    }
}

