package Student;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class MarksCalculatorTest
{
    @Mock
    private StudentData student;
    @Mock
    private StudentMarks marks;
    @InjectMocks
    private MarksCalculator mrkCal;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(marks.getEnglishMarks()).thenReturn(46.0);
        when(marks.getScienceMarks()).thenReturn(30.0);
        when(marks.getMathsMarks()).thenReturn(50.0);
        when(student.getRoll()).thenReturn(1);
        when(student.getName()).thenReturn("geetha");
        when(student.getMarks()).thenReturn(marks);
    }
    @Test
    public void totalMarksForValidStudent() {
        double total = mrkCal.CalculateTotal(student);
        assertEquals(126.0, total,0.0);
    }
    @Test
    public void totalMarksForInvalidStudent() {
        double total = mrkCal.CalculateTotal(null);
        assertEquals(0, total,0.0);
    }
    @Test
    public void totalMarksForInvalidMarks() {
        when(student.getMarks()).thenReturn(null);
        double total = mrkCal.CalculateTotal(student);
        assertEquals(0.0, total,0.0);
    }
}

