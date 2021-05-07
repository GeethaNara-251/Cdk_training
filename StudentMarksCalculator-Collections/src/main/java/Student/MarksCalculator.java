package Student;

import java.util.List;

import static Student.StudentMarks.getMarks;

public class MarksCalculator {
    private final MarksValidator marksValidator;
    public MarksCalculator(){marksValidator=new MarksValidator();}
    public double CalculateTotal(List<StudentMarks> marks){
        double sum=0.0;
        for (StudentMarks mark : marks) {
            if (marksValidator.isValidMarks(mark)) sum = sum + getMarks();
        }
        return sum;
    }
    private boolean isValidStudent(StudentData studentdata) {
        return studentdata!=null && studentdata.getMarks()!=null;
    }
}


