package Student;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


public class MarksCalculatorTest
{
    @Mock
    private StudentData student;
    @Mock
    private MarksValidator marksValidator;
    @Mock
     StudentMarks mark;
    @InjectMocks
    private MarksCalculator marksCalculator;
    private List<StudentMarks> marks;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        when(marksValidator.isValidMarks(mark)).thenReturn(true);
        marks=new ArrayList<>();
        marks.add(new StudentMarks("english",29));
        marks.add(new StudentMarks("science",25));
        marks.add(new StudentMarks("maths",51));

    }
    @Test
    public void totalMarksForValidStudent() {
        when(student.getMarks()).thenReturn(marks);
        double total = marksCalculator.CalculateTotal(marks);
        assertEquals(153.0, total,0.0);
    }
}

