package Student;

public class MarksCalculator {
    private final MarksValidator marksValidator;

    public MarksCalculator() {
        marksValidator = new MarksValidator();
    }


    public double CalculateTotal(StudentData student) {
        if (isValidStudent(student)) {
            StudentMarks marks = student.getMarks();
            if (marksValidator.isValidMarks(marks)) {

                return marks.getEnglishMarks() + marks.getScienceMarks() + marks.getMathsMarks();
            }
        }
        return 0.0;
    }

    private boolean isValidStudent(StudentData studentdata) {
        return studentdata != null && studentdata.getMarks() != null;
    }

    private boolean isValidMark(StudentMarks marks) {
        return marksValidator.isValidMarks(marks);
    }

}

