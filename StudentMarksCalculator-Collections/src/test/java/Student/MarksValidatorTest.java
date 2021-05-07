package Student;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;


public class MarksValidatorTest {
    StudentData stu;
    @Mock
    StudentMarks marks;
    @InjectMocks
    private MarksValidator markValidator;

    @Before
    public void setUp() {
        markValidator = new MarksValidator();
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreNegative() {
         when(marks.getMarks()).thenReturn(-10);
        when(marks.getSubject()).thenReturn(("english"));
        markValidator.isValidMarks(marks);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreExceeds() {
        when(StudentMarks.getMarks()).thenReturn(251);
        when(marks.getSubject()).thenReturn(("maths"));

        markValidator.isValidMarks(marks);
    }

    @Test
    public void shouldReturnTrueMarksIfMarksAreValid() {
        when(StudentMarks.getMarks()).thenReturn(25);
        when(marks.getSubject()).thenReturn(("english"));
        boolean flag = markValidator.isValidMarks(marks);
        assertTrue(flag);
    }

}
















