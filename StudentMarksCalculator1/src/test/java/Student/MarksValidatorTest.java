package Student;

import org.junit.Before;
import org.junit.Test;
import Student.StudentMarks;
import Student.MarksValidator;
import static org.junit.Assert.*;



public class MarksValidatorTest {
    private StudentMarks marks;
    private MarksValidator markValidator;
    @Before
    public void setUp() {
        markValidator = new MarksValidator();
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreNegative(){
        marks = new StudentMarks(-10, 38, 45);
        markValidator.isValidMarks(marks);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreExceeds(){
        marks = new StudentMarks(100, 0, 101);
        markValidator.isValidMarks(marks);
    }
    @Test
    public void shouldInitializeMarksIfMarksAreValid(){
        marks = new StudentMarks(40, 38, 100);
        boolean flag = markValidator.isValidMarks(marks);
        assertEquals(true, flag);
    }



















}