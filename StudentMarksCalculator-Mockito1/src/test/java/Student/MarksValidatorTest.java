package Student;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;


public class MarksValidatorTest {
    @Mock
    private StudentMarks marks;
    @InjectMocks
    private MarksValidator markValidator;
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        markValidator = new MarksValidator();
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreNegative(){
        when(marks.getEnglishMarks()).thenReturn(46.0);
        when(marks.getScienceMarks()).thenReturn(-12.0);
        when(marks.getMathsMarks()).thenReturn(32.0);
        markValidator.isValidMarks(marks);
    }
    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMarksAreExceeds(){
        when(marks.getEnglishMarks()).thenReturn(151.0);
        when(marks.getScienceMarks()).thenReturn(-37.0);
        when(marks.getMathsMarks()).thenReturn(0.0);
        markValidator.isValidMarks(marks);
    }
    @Test
    public void shouldInitializeMarksIfMarksAreValid(){
        when(marks.getEnglishMarks()).thenReturn(40.0);
        when(marks.getScienceMarks()).thenReturn(38.0);
        when(marks.getMathsMarks()).thenReturn(100.0);
        boolean flag = markValidator.isValidMarks(marks);
        assertTrue(flag);
    }



















}