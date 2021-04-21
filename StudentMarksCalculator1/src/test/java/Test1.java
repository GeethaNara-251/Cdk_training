import Student.MarksCalculator;
import Student.StudentData;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;

public class Test1 {
    private static DecimalFormat df1 = new DecimalFormat("#.##");

    @Test
    public void datatype() {
        StudentData st = new StudentData(1, "geetha", (double) 7.1, (double) 9.8, (double) 8.2);
        MarksCalculator Mr = new MarksCalculator();
        double tot = Mr.calcMarks(st);
        assertEquals("25.1", df1.format(tot));
    }
}
