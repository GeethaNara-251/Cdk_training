import Student.MarksCalculator;
import Student.StudentData;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertNotSame;

public class Test2 {
    private static final DecimalFormat df1 = new DecimalFormat("#.##");

    @Test
    public void datatype() {
        StudentData st = new StudentData(1, "geetha", (double) 10.0, (double) 9.8, (double) 8.2);
        MarksCalculator Mr = new MarksCalculator();
        double tot = Mr.calcMarks(st);
        assertNotSame("51.25", df1.format(tot));
    }
}
